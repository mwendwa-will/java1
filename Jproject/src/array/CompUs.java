package array;

import java.util.ArrayList;

public class CompUs
{
    public static void main(String[] args) {
        ArrayList<EmpConst> collabo;
        collabo=new ArrayList<>();

        EmpConst em1=new EmpConst("William ","Mwendwa ","will_23@hotmail.com ","0723456123" , 2  ,70000.00);
        EmpConst em2=new EmpConst("Jane ","Kahuha ","jklove@hotmail.com ","0733456123" , 5 ,70000.00);
        EmpConst em3=new EmpConst("Musa ","Ali ","musali@hotmail.com ","0723400123" , 3 ,70000.00);
        EmpConst em4=new EmpConst("Wamlambez ","Wamnyoz ","wwnyoz@hotmail.com ","0777456123" , 7 ,70000.00);
        EmpConst em5=new EmpConst("Brian ","Mwangi ","bmwangi@hotmail.com ","0790655654" ,  8 ,70000.00);
        EmpConst em6=new EmpConst("Selina ","Kyle ","sylk@hotmail.com ","0743452123" , 12 ,70000.00);
        EmpConst em7=new EmpConst("Pendo ","Shareza ","peshex@hotmail.com ","0790456123" , 1,70000.00);
        EmpConst em8=new EmpConst("Liz ","Mumbi ","lil.mumbi@hotmail.com ","0727456123" , 4 ,70000.00);
        EmpConst em9=new EmpConst("Chacha ","Peter ","chacha@hotmail.com ","0789456123" , 9 ,70000.00);
        EmpConst em10=new EmpConst("Enrique ","Mash ","enmash@hotmail.com ","0723656123" , 8 ,70000.00);

        collabo.add(em1);
        collabo.add(em2);
        collabo.add(em3);
        collabo.add(em4);
        collabo.add(em5);
        collabo.add(em6);
        collabo.add(em7);
        collabo.add(em8);
        collabo.add(em9);
        collabo.add(em10);

        System.out.println(collabo.toString());
    }

}
