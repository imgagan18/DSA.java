import heapq

class State:
    def __init__(self, jug1, jug2, parent=None):
        self.jug1 = jug1
        self.jug2 = jug2
        self.parent = parent
        self.cost = 0

    def __lt__(self, other):
        return self.cost < other.cost

    def __eq__(self, other):
        return self.jug1 == other.jug1 and self.jug2 == other.jug2

    def __hash__(self):
        return hash((self.jug1, self.jug2))

def is_goal(state, target):
    return state.jug1 == target or state.jug2 == target

def generate_successors(current, jug1_capacity, jug2_capacity):
    successors = []

    # Fill jug1
    successors.append(State(jug1_capacity, current.jug2, current))

    # Fill jug2
    successors.append(State(current.jug1, jug2_capacity, current))

    # Empty jug1
    successors.append(State(0, current.jug2, current))

    # Empty jug2
    successors.append(State(current.jug1, 0, current))

    # Pour water from jug1 to jug2
    pour = min(current.jug1, jug2_capacity - current.jug2)
    successors.append(State(current.jug1 - pour, current.jug2 + pour, current))

    # Pour water from jug2 to jug1
    pour = min(current.jug2, jug1_capacity - current.jug1)
    successors.append(State(current.jug1 + pour, current.jug2 - pour, current))

    return successors

def heuristic(state, target):
    return abs(state.jug1 - target) + abs(state.jug2 - target)

def astar(initial_state, target, jug1_capacity, jug2_capacity):
    open_set = [initial_state]
    closed_set = set()

    while open_set:
        current = heapq.heappop(open_set)

        if is_goal(current, target):
            path = []
            while current:
                path.append((current.jug1, current.jug2))
                current = current.parent
            return path[::-1]

        closed_set.add(current)

        successors = generate_successors(current, jug1_capacity, jug2_capacity)
        for successor in successors:
            successor.cost = current.cost + 1 + heuristic(successor, target)

            if successor not in closed_set and successor not in open_set:
                heapq.heappush(open_set, successor)

    return None

def main():
    jug1_capacity = 4
    jug2_capacity = 3
    target = 2

    initial_state = State(0, 0)
    path = astar(initial_state, target, jug1_capacity, jug2_capacity)

    if path:
        print("Solution found:")
        for step, state in enumerate(path):
            print(f"Step {step + 1}: Jug1={state[0]}, Jug2={state[1]}")
    else:
        print("No solution found.")

if __name__ == "__main__":
    main()