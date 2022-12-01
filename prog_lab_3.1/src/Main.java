import Human.*;
import Items.*;

public class Main {
    public static void main(String[] args){
        Human malish = new Human("Малыш",Sex.MAN,Size.SMALL);
        Human bok = new Human("Фрекен Бок",Sex.WOMAN,Size.BIG);
        Bell bell = new Bell("колокольчик",Size.MEDDIUM);
        Cord cord = new Cord("шнур",Size.MEDDIUM);
        Leg leg = new Leg("ноги",Size.BIG);
        System.out.print("Но вот " + Form.SHE + bok.appeared() + Other.DOT);
        System.out.print(Time.BEFORE + malish.named() + malish.saw() + Where.INDOOR + Form.HER + leg.BigLeg() + leg + Other.DOT);
        System.out.println(malish.named() + Other.COMMA + malish.fluttered() + "так " + Form.HE + malish.scared() + Other.COMMA + How.ALTHOUGH + malish.waited() + Form.HER + "и " + malish.knew() + Other.COMMA + "что " + Form.SHE + Time.NOW + bok.WillCome() + Other.DOT);
        System.out.print(bok.named() + How.GLOOMILY + bok.looked() + "на " + Form.HIM + Other.DOT);
        System.out.println(Form.ITHE + "так " + malish.cheated() + Other.COMMA + "чтобы " + bok.force() + Form.HER + bok.ComeUp() + Where.BYWINDOW + Other.COMMA + "а " + Form.MYSELF + How.IMPTRCEPTIBLY + malish.shoved() + Where.UNDERCURTAIN + Other.COMMA + Where.FORWHICH + cord + Other.COMMA + "и " + malish.pulled() + Form.HIS + How.STRONGLY + Other.DOT);
        System.out.print(Form.BHE + malish.heard() + Other.COMMA + How.HOW + Where.ONROOF + bell + Other.DOT);
        System.out.print(bok.named() + " это " + How.TOO + bok.HeardWom() + Other.DOT);
    }
}