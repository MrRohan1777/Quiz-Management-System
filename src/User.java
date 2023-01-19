/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ROHAN
 */
class User {
    private String id, name, opt1, opt2, opt3, opt4, answer, subject;


    public User(String id,String name,String opt1,String opt2,String opt3,String opt4,String answer,String subject)
    {
        this.id=id;
        this.name=name;
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.answer=answer;
        this.subject=subject;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getopt1(){
        return opt1;
    }
    public String getopt2(){
        return opt2;
    }
    public String getopt3(){
        return opt3;
    }
    public String getopt4(){
        return opt4;
    }
    public String getanswer(){
        return answer;
    }
    public String getsubject(){
        return subject;
    }
}
