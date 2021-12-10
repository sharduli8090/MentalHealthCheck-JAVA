import java.util.*;


public class MHS{


    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    static void welcome(){

        System.out.println();

        System.out.println("*******************************************");

        System.out.println();

        System.out.println("MENTAL HEALTH CHECK");

        System.out.println();

        System.out.println("You are not alone!!!!!!!!!!");

        System.out.println();

        System.out.println("We recommend you to read below before proceding....");

        System.out.println();

        System.out.println("Press Enter To Continue");
        try{
            System.in.read();
        }
        catch(Exception e){}

        System.out.println("Health is Wealth! \n\n Often we have heard this statement that if you are healthy then no one can stop you from being wealthy. We always follow this statement but often forget that health is not sticked to physical health only, mental health is also important. Infact, mental health is the most important and can't be ignored at any cost! \n\n Sometimes or say most of the times this happens that we don't even get to know that we our suffering from this disease. Also when people get to know about this disease they try to hide this, because of society fears. \n\n But its completely normal or ok to have depression or similars. Remember, YOU ARE NOT ALONE! Its like any other disease, which need to be detected at earlier stages to avoid any hazardous conditions! \n\n For the best treatment you need to detect this disease at early stage. For that we first need to do some tests at our level, before reaching out at other levels. \n\n This small test is designed for self screening of depression. It hardly takes more than 10 minutes to complete this test but can become a life saviour for you or your closed ones! Its an anonymous test and data is asked for evaluation purpose only.\n\n If you are 16 or above you can take this test! YOu can also take this test on the behalf of your loved one!\n\n WARNING : THis is just a small evaluation of depression. There are much more symtoms or complexity into it. We advise you to consult your doctor for best treatment. ");

        System.out.println();

        System.out.println("Press Enter To Continue");
        try{
            System.in.read();
        }
        catch(Exception e){}
    }

    static boolean SelfORother(){

        while(true){
        System.out.println("Press 1 if you want to take this test for yourself \n Press 0 if you want to take this test for any of your loved one \n");

        int bool = sc.nextInt();
        
        if(bool==1){return true;}
        else if(bool==0){return false;}
        else{
            System.out.println("Wrong INput ! ");

        }

        }
    }

    static void set1(){
        System.out.println("Answer the following questions honestly for best results !");

        System.out.println();
int age;
        while(true){
        System.out.println("Enter your age : \n");
        age = sc.nextInt();
        if(age<16){
            System.out.println("You are not eligible for this test ! Thankyou ! ");
            score -= 1;
            return ;
        }
        else if(age>150){
            System.out.println("Age not possible");
        }
        else{
            break;
        }
    }

        System.out.println();

        while(true){
        System.out.println("Enter your gender : \n Press F for Female \n Press M for Male \n Press O for other\n ");

        System.out.println();

        char gender = sc.next().charAt(0);

        if(gender=='F' || gender=='f'){
            score += 1;
            break;
        }else if(gender=='o' || gender=='O'){
            score += 2;
            break;
        }
        else if(gender=='m' || gender=='M'){
            break;
        }
        else{
            System.out.println("Wrong input!!");
        }
    }

        System.out.println();

        if(age>=16 && age<=33){
            QuestionSet1();
        }else if(age>=34 && age<=50){
            QuestionSet2();
        }else{
            QuestionSet3();
        }

    }

    static void set2(){  
        System.out.println("Answer the following questions honestly for the best results for your loved ones !");

        System.out.println();
        int age;
        while(true){
        System.out.println("Enter your loved one's age : \n");
         age = sc.nextInt();
        if(age<16){
            System.out.println("Your loved one is not eligible for this test ! Thankyou ! ");
            return ;
        }else if(age>150){
            System.out.println("Age not possible");
        }
        else{
            break;
        }
    }
        
        System.out.println();

        while(true){
        System.out.println("Enter your loved one's gender : \n Press F for Female \n Press M for Male \n Press O for other\n ");

        System.out.println();

        char gender = sc.next().charAt(0);

        if(gender=='F' || gender=='f'){
            score += 1;
            break;
        }else if(gender=='o' || gender=='O'){
            score += 2;
            break;
        }
        else if(gender=='m' || gender=='M'){
            break;
        }
        else{
            System.out.println("Wrong input!!");
        }
    }

        System.out.println();

        if(age>=16 && age<=33){
            QuestionSeto1();
        }else if(age>=34 && age<=50){
            QuestionSeto2();
        }else{
            QuestionSeto3();
        }

    }

    static void QuestionSeto1(){
        
        System.out.println();

        while(true){
        System.out.println("Anything big has happened to your loved one like loss of any loved one, any financial crisis, any relationship issues, or etc. major mishappening in life ?? ");

        System.out.println("Press 1 for Yes \n Press 0 for No\n");

        System.out.println();

        int input = sc.nextInt();

        if(input==1){
            score += 3;
            break;
        }else if(input==0){
            break;
        }else{
            System.out.println("Wrong Input!!");
        }
    }

        System.out.println();

        String[] quesSet1 = {"How often have your loved one been bothered by trouble failing or staying asleep, or sleeping too much ? ","How often have your loved one had little interest or pleasure in doing things? ","How often have your loved one been bothered by feeling down, depressed or hopeless? ","How often have your loved one been bothered by poor apetite or overeating? ","How often have your loved one been bothered by trouble concentrating on things, such as watching television? ","How often your loved one feel struggling in school and tend to think it is because your loved one is not smart enough? ","How often have your loved one been bothered by having trouble relaxing after studies? ","Have your loved one felt like an anxiety attack ( suddenly feeling fear or panic ) ?","How often your loved one feel like he or she don't deserve to be loved? ","How many items have your loved one been bothered by getting easily annoyed or irritable? " };
        
        int size = quesSet1.length;

        for(int i=0;i<size;i++){

            while(true){
            System.out.println(quesSet1[i]);

            System.out.println("Press 1 for : NEVER ");
            System.out.println("Press 2 for : SOMETIMES ");
            System.out.println("Press 3 for : HALF OF THE TIME ");
            System.out.println("Press 4 for : EVERYTIME ");

            int ans = sc.nextInt();
            if(ans==1){
                break;
            }
            else if(ans==2){
                score += 1;
                break;
            }else if(ans==3){
                score += 3;
                break;
            }else if(ans==4){
                score += 5;
                break;
            }
            else{
                System.out.println("Wrong Input!!");
            } }          
        }

    }

    static void QuestionSeto2(){
        
        System.out.println();

        while(true){
        System.out.println("Anything big has happened to your loved one like loss of any loved one, any financial crisis, any relationship issues, or etc. major mishappening in life ?? ");

        System.out.println("Press 1 for Yes \n Press 0 for No\n");

        System.out.println();

        int input = sc.nextInt();

        if(input==1){
            score += 3;
            break;
        }else if(input==0){
            break;
        }else{
            System.out.println("Wrong Input!!");
        }
    }

        System.out.println();

        String[] quesSet2 = {"How often have your loved one been bothered by trouble failing or staying asleep, or sleeping too much ? ","How often have your loved one had little interest or pleasure in doing things? ","How often have your loved one been bothered by feeling down, depressed or hopeless? ","How often have your loved one been bothered by poor apetite or overeating? ","How often have your loved one been bothered by trouble concentrating on things, such as reading the newspaper or watching television? ","How often your loved one feel struggling in work and tend to think it is because your loved one is not smart enough? ","How often have your loved one been bothered by having trouble relaxing after work? ","Have your loved one felt like an anxiety attack ( suddenly feeling fear or panic ) ?","How often your loved one feel like he or she don't deserve to be loved or don't have someone who can love him or her? ","How many items have your loved one been bothered by getting easily annoyed or irritable? " };
        
        int size = quesSet2.length;

        for(int i=0;i<size;i++){

            while(true){
            System.out.println(quesSet2[i]);

            System.out.println("Press 1 for : NEVER ");
            System.out.println("Press 2 for : SOMETIMES ");
            System.out.println("Press 3 for : HALF OF THE TIME ");
            System.out.println("Press 4 for : EVERYTIME ");

            int ans = sc.nextInt();
            if(ans==1){
                break;
            }
            else if(ans==2){
                score += 1;
                break;
            }else if(ans==3){
                score += 3;
                break;
            }else if(ans==4){
                score += 5;
                break;
            }
            else{
                System.out.println("Wrong Input!!");
            } } 
        }
    }

    static void QuestionSeto3(){
        
        
        System.out.println();

        while(true){
        System.out.println("Anything big has happened to your loved one like loss of any loved one, any financial crisis, any relationship issues, or etc. major mishappening in life ?? ");

        System.out.println("Press 1 for Yes \n Press 0 for No\n");

        System.out.println();

        int input = sc.nextInt();

        if(input==1){
            score += 3;
            break;
        }else if(input==0){
            break;
        }else{
            System.out.println("Wrong Input!!");
        }
    }

        System.out.println();

        String[] quesSet3 = {"How often have your loved one been bothered by trouble failing or staying asleep, or sleeping too much ? ","How often have your loved one had little interest or pleasure in doing things? ","How often have your loved one been bothered by feeling down, depressed or hopeless? ","How often have your loved one been bothered by poor apetite or overeating? ","How often have your loved one been bothered by trouble concentrating on things, such as reading the newspaper? ","How often your loved one feel struggling in work or daily visiting places and tend to think it is because he or she is not smart enough? ","How often have your loved one been bothered by having trouble relaxing after work or anytime? ","Have your loved one felt like an anxiety attack ( suddenly feeling fear or panic ) ?","How often your loved one feel like he or she don't have someone who can love him or her? ","How many items have your loved one been bothered by getting easily annoyed or irritable? " };
        
        int size = quesSet3.length;

        for(int i=0;i<size;i++){

            while(true){
            System.out.println(quesSet3[i]);

            System.out.println("Press 1 for : NEVER ");
            System.out.println("Press 2 for : SOMETIMES ");
            System.out.println("Press 3 for : HALF OF THE TIME ");
            System.out.println("Press 4 for : EVERYTIME ");

            int ans = sc.nextInt();

            if(ans==1){
                break;
            }
            else if(ans==2){
                score += 1;
                break;
            }else if(ans==3){
                score += 3;
                break;
            }else if(ans==4){
                score += 5;
                break;
            }
            else{
                System.out.println("Wrong Input!!");
            } }           
        }
    }

    static void QuestionSet1(){

        System.out.println();

        while(true){
        System.out.println("Anything big has happened to you like loss of any loved one, any financial crisis, any relationship issues, or etc. major mishappening in life ?? ");

        System.out.println("Press 1 for Yes \n Press 0 for No\n");

        System.out.println();

        int input = sc.nextInt();

        if(input==1){
            score += 3;
            break;
        }else if(input==0){
            break;
        }else{
            System.out.println("Wrong Input!!");
        }
    }

        System.out.println();

        String[] quesSet1 = {"How often have you been bothered by trouble failing or staying asleep, or sleeping too much ? ","How often have you had little interest or pleasure in doing things? ","How often have you been bothered by feeling down, depressed or hopeless? ","How often have you been bothered by poor apetite or overeating? ","How often have you been bothered by trouble concentrating on things, such as watching television? ","How often you feel struggling in school and tend to think it is because you are not smart enough? ","How often have you been bothered by having trouble relaxing after studies? ","Have you felt like an anxiety attack ( suddenly feeling fear or panic ) ?","How often you feel like you don't deserve to be loved? ","How many items have you been bothered by getting easily annoyed or irritable? " };
        
        int size = quesSet1.length;

        for(int i=0;i<size;i++){

            while(true){
            System.out.println(quesSet1[i]);

            System.out.println("Press 1 for : NEVER ");
            System.out.println("Press 2 for : SOMETIMES ");
            System.out.println("Press 3 for : HALF OF THE TIME ");
            System.out.println("Press 4 for : EVERYTIME ");

            int ans = sc.nextInt();

            if(ans==1){
                break;
            }
            else if(ans==2){
                score += 1;
                break;
            }else if(ans==3){
                score += 3;
                break;
            }else if(ans==4){
                score += 5;
                break;
            }
            else{
                System.out.println("Wrong Input!!");
            } }         
        }

    }

    static void QuestionSet2(){
        
        System.out.println();

        while(true){
        System.out.println("Anything big has happened to you like loss of any loved one, any financial crisis, any relationship issues, or etc. major mishappening in life ?? ");

        System.out.println("Press 1 for Yes \n Press 0 for No\n");

        System.out.println();

        int input = sc.nextInt();

        if(input==1){
            score += 3;
            break;
        }else if(input==0){
            break;
        }else{
            System.out.println("Wrong Input!!");
        }
    }

        System.out.println();

        String[] quesSet2 = {"How often have you been bothered by trouble failing or staying asleep, or sleeping too much ? ","How often have you had little interest or pleasure in doing things? ","How often have you been bothered by feeling down, depressed or hopeless? ","How often have you been bothered by poor apetite or overeating? ","How often have you been bothered by trouble concentrating on things, such as reading the newspaper or watching television? ","How often you feel struggling in work and tend to think it is because you are not smart enough? ","How often have you been bothered by having trouble relaxing after work? ","Have you felt like an anxiety attack ( suddenly feeling fear or panic ) ?","How often you feel like you don't deserve to be loved or don't have someone who can love you? ","How many items have you been bothered by getting easily annoyed or irritable? " };
        
        int size = quesSet2.length;

        for(int i=0;i<size;i++){

            while(true){
            System.out.println(quesSet2[i]);

            System.out.println("Press 1 for : NEVER ");
            System.out.println("Press 2 for : SOMETIMES ");
            System.out.println("Press 3 for : HALF OF THE TIME ");
            System.out.println("Press 4 for : EVERYTIME ");

            int ans = sc.nextInt();

            if(ans==1){
                break;
            }
            else if(ans==2){
                score += 1;
                break;
            }else if(ans==3){
                score += 3;
                break;
            }else if(ans==4){
                score += 5;
                break;
            }
            else{
                System.out.println("Wrong Input!!");
            } }         
        }
    }

    static void QuestionSet3(){
        
        
        System.out.println();

        while(true){
        System.out.println("Anything big has happened to you like loss of any loved one, any financial crisis, any relationship issues, or etc. major mishappening in life ?? ");

        System.out.println("Press 1 for Yes \n Press 0 for No\n");

        System.out.println();

        int input = sc.nextInt();

        if(input==1){
            score += 3;
            break;
        }else if(input==0){
            break;
        }else{
            System.out.println("Wrong Input!!");
        }
    }

        System.out.println();

        String[] quesSet3 = {"How often have you been bothered by trouble failing or staying asleep, or sleeping too much ? ","How often have you had little interest or pleasure in doing things? ","How often have you been bothered by feeling down, depressed or hopeless? ","How often have you been bothered by poor apetite or overeating? ","How often have you been bothered by trouble concentrating on things, such as reading the newspaper? ","How often you feel struggling in work or daily visiting places and tend to think it is because you are not smart enough? ","How often have you been bothered by having trouble relaxing after work or anytime? ","Have you felt like an anxiety attack ( suddenly feeling fear or panic ) ?","How often you feel like you don't have someone who can love you? ","How many items have you been bothered by getting easily annoyed or irritable? " };
        
        int size = quesSet3.length;

        for(int i=0;i<size;i++){

            while(true){
            System.out.println(quesSet3[i]);

            System.out.println("Press 1 for : NEVER ");
            System.out.println("Press 2 for : SOMETIMES ");
            System.out.println("Press 3 for : HALF OF THE TIME ");
            System.out.println("Press 4 for : EVERYTIME ");

            int ans = sc.nextInt();

            if(ans==1){
                break;
            }
            else if(ans==2){
                score += 1;
                break;
            }else if(ans==3){
                score += 3;
                break;
            }else if(ans==4){
                score += 5;
                break;
            }
            else{
                System.out.println("Wrong Input!!");
            } }       
        }
    }

    static void endMessage(){
        

      

        if(score==50 && score>=40){
            System.out.println("Score after evaluation is : "+score+" !!");
        System.out.println("Doctor consultation is highly recommended that too ASAP! Talk with your family! And remember you are not alone! ");
        System.out.println("Your are at very HIGH RISK of Depression !!");
        System.out.println();
        System.out.println("WARNING : Thankyou for taking out time for yourself and this is a just a small self evaluatiohn and for best treatment and advise doctor consult is advisable.");
        }
        else if(score>=27 && score<=39){
            System.out.println("Score after evaluation is : "+score+" !!");
        System.out.println("Doctor Consultation is advisable! Talk with your family! And remember you are not alone!");
        System.out.println("Your are at HIGH RISK of Depression !!");
        System.out.println();
        System.out.println("WARNING : Thankyou for taking out time for yourself and this is a just a small self evaluatiohn and for best treatment and advise doctor consult is advisable.");
        }
        else if(score>=16 && score<=26){
            System.out.println("Score after evaluation is : "+score+" !!");
        System.out.println("Talk with your Family! You can consult your Doctor if any of the above symptoms continues or become frequent! Happy Mental Health! ");
        System.out.println("Your are at MEDIUM RISK of Depression !!");
        System.out.println();
        System.out.println("WARNING : Thankyou for taking out time for yourself and this is a just a small self evaluatiohn and for best treatment and advise doctor consult is advisable.");
        }
        else if(score>=6 && score<=15){
            System.out.println("Score after evaluation is : "+score+" !!");
        System.out.println("Your Mental is doing well! Just believe in yourself and never forget that you are not alone! Talk to your loved ones if needed! Happy Mental Health!!");
        System.out.println("Your are at LOW RISK of Depression !!");
        System.out.println();
        System.out.println("WARNING : Thankyou for taking out time for yourself and this is a just a small self evaluatiohn and for best treatment and advise doctor consult is advisable.");
        }
        else if(score>=0 && score<=5){
            System.out.println("Score after evaluation is : "+score+" !!");
        System.out.println("Your Mental Health is completely fine!! KEEP GOING HAPPILY!! Happy Mental Health!!");
        System.out.println("Your are at very LOW RISK of Depression !!");
        System.out.println();
        System.out.println("WARNING : Thankyou for taking out time for yourself and this is a just a small self evaluatiohn and for best treatment and advise doctor consult is advisable.");
        }

        

    }

    public static void main(String[] args){
       
        while(true){
        welcome();
        
        Boolean self = SelfORother();
        if(self){
            set1();
        }
        else{
            set2();
        }

        endMessage();
        System.out.println();
        System.out.println("Press any key to exit \n Press 0 to retake the test");
        int menu;
        try{
            menu = sc.nextInt();
        }
        catch(Exception e){
                break;
        }
        if(menu==0){}
        else{
            break;
        }
            
        }

    }
}