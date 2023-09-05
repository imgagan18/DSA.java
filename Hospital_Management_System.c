#include<stdio.h> 
struct Patient
{
char patient_name[30]; 
char conditon[30];
char consulting_doctor[30];
 int patient_ID;
char patient_status[40]; 
char consultation_date[30]; 
int phone_no;
int patient_age;
};
void main() {
int i,n,password,ID;
char ch;
struct Patient Pa[30];
printf("Enter number of patients whose data you want to enter");
 scanf("%d",&n);
for(i=0;i<n;i++) 
{
printf("Enter the name of the patient\n");
 scanf("%s",Pa[i].patient_name);
  printf("Enter patient age\n"); 
  scanf("%d",&Pa[i].patient_age); 
  printf("Enter phone number of patient\n"); 
  scanf("%d",&Pa[i].phone_no); 
  printf("Enter patient ID\n"); 
  scanf("%d",&Pa[i].patient_ID); 
  printf("Enter patient condition\n");
 scanf("%s",Pa[i].conditon);
printf("Enter name of consulting doctor\n"); 
scanf("%s",Pa[i].consulting_doctor);
 printf("Enter the date of consultation\n"); 
 scanf("%s",Pa[i].consultation_date);
  printf("Enter patient status\n");
   scanf("%s",Pa[i].patient_status);
}
printf("Enter password to access patient records\n");
 scanf("%d",&password);
if(password == 1234)
{
printf("Enter patient ID whose records you want to access\n"); 
scanf("%d",&ID);
for(i=0;i<n;i++)
{
if (ID == Pa[i].patient_ID) {
printf("The name of the patient is: %s\n",Pa[i].patient_name);
printf("The age of the patient is: %d\n",Pa[i].patient_age);
printf("The phone number of the patient is: %d\n",Pa[i].phone_no);
printf("The patient condition when visited last time was: %s\n",Pa[i].conditon); printf("The name of the consulting doctor is: %s\n",Pa[i].consulting_doctor); printf("The last date of consultaion was: %s\n",Pa[i].consultation_date); printf("The last status of patient was: %s\n", Pa[i].patient_status);
break;
} 
}
} 
else
 {
printf("Incorrect password\n"); 
}
}