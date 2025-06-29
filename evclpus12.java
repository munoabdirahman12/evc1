import java.util.Date;
import java.util.Scanner;
public class evclpus12{
    public static void main(String[] args) {
        Date currenDateAndTime=new Date();
        Scanner input = new Scanner(System.in);
        //java programing EVCLUS
        int balance = 2000;
        double money;
        int option, phone;
        int account_no=12345678;
        int haraga_account=1000;
        System.out.println("codka soogali:");
        String n = input.nextLine();
        if (n.startsWith("*") && n.endsWith("#")) {
            System.out.println("fadlan gali pinkaaga");
            int password = input.nextInt();
            if (password == 1234) {

                //all selection
                System.out.println("EVPLus");
                System.out.println("1.itus Haraagaga");
                System.out.println("2.Karka ku hadalka");
                System.out.println("3.Bixi bill");
                System.out.println("4.U wareeji EVCplus");
                System.out.println("5.Warbixin kooban");
                System.out.println("6.Salam bank");
                System.out.println("7.Maareynta");
                System.out.println("8.TAAJ");
                // seletion  one  pinkaaga
            } else
                System.out.println("pinkaaga waa qalad");
            int selection = input.nextInt();
            if (selection  == 1)
                System.out.println("haraagaga waa $"+balance );
                //seletion  2: Karka ku hadalka
            else if (selection  == 2) {
                System.out.println("kaarka hadalka");
                System.out.println("1.ku shuba Airtime");
                System.out.println("2.ugu dhub airtime");
                System.out.println("3.MIFI Packages");
                System.out.println("4.ku shuba internet");
                System.out.println("5.ugu shub qof kle (MMT)");
                int op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("fadlan geli lacagta");
                        money = input.nextDouble();
                        System.out.println("ma hubtaa inaa $" + money + "ugu shubtid? \n" + "1.haa \n " + "2.maya");
                        option = input.nextInt();
                        if (option == 1) {
                            if (money > balance )
                                System.out.println("xisaabtaada kugu ma filna");
                            else {
                                System.out.println("EVC PLUS");
                                System.out.println("waxaad ku shubatay $$" + money+"Tar:"+currenDateAndTime+",haraagaagu waa" + ((balance  - money)) + "$");
                            }
                        } else
                            System.out.println("mahadsanid");
                        break;
                    case 2:
                        if (op == 2) {
                            System.out.println("fadlan geli numberka");
                            phone = input.nextInt();
                            System.out.println("fadlan geli lacagta");
                            money = input.nextDouble();
                            System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "? \n" + "1.haa \n " + "2.maya");
                            option= input.nextInt();
                            if (option == 1) {
                                if (money >balance )
                                    System.out.println("Haragaga  kugu ma filna");
                                else {
                                    System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                            + phone +"Tar:"+currenDateAndTime+ "\n Haraagaaga waa $" + ((balance  - money)));
                                }
                            }
                        } else
                            System.out.println("mahadsanid");
                        break;
                    case 3:
                        System.out.println("1.ku shubo data-da mifi");
                        option = input.nextInt();
                        System.out.println("--internet Bundle Recharge --");
                        System.out.println("1.isbuucle(weekly)");
                        System.out.println("2.Bille(Mifi)");
                        System.out.println("3.Maalinle(Daily)");
                        option = input.nextInt();
                        System.out.println("Fadlan dooro bundle ka");
                        System.out.println("1.$5." +
                                "8=10GB");
                        System.out.println("2.$10=25GB ");
                        break;
                    case 4:
                        System.out.println("fadl doora numberka ku shubeyso");
                        System.out.println("1.Isbuucle(weekly");
                        System.out.println("2.Bille (Mifi)");
                        System.out.println("3.Maalinle (Daily)");
                        System.out.println("4.TIME BASED PACKAGES");
                        System.out.println("5.DATA");
                        option = input.nextInt();
                        System.out.println("Fadlan geli numberka");
                        phone = input.nextInt();
                        System.out.println("fadlan geli lacagta");
                        money = input.nextInt();
                        System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "? \n" + "1.haa \n " + "2.maya");
                        option = input.nextInt();
                        if (option == 1) {
                            if (phone >= 617726585 && phone <= 619999999) {
                                if (money > balance )
                                    System.out.println("xisaabtaada kugu ma filna");
                                else {
                                    System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                            + phone + "Tar:"+"\n Haraagaaga waa $" + ((balance  - money)));
                                }

                            } else
                                System.out.println("lambarka aad galisi ma ahan mid jiro");
                            break;
                        }

                    case 5:
                        System.out.println("fadlan geli numberka");
                        phone = input.nextInt();
                        System.out.println("fadlan geli lacagta");
                        money = input.nextInt();
                        System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "? \n" + "1.haa \n " + "2.maya");
                        option = input.nextInt();
                        if (option == 1) {

                            if (money > balance )
                                System.out.println("xisaabtaada kugu ma filna");
                            else {
                                System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                        + phone +"Tar:"+currenDateAndTime+ "\n Haraagaaga waa $" + ((balance  - money)));
                            }

                        } else
                            System.out.println("mahadsanid");
                        break;
                    default:
                        System.out.println("fadlan doora numberka saxda ah");
                }

                // seletion 3.Bixi bill
            } else if (selection  == 3) {
                System.out.println("Bixi Biil");
                System.out.println("1.Post pad");
                System.out.println("2.ku libso");
                option = input.nextInt();
                if (option == 1) {
                    System.out.println("Post paid");
                    System.out.println("1.ogow Biilka");
                    System.out.println("2.Bixi Bill");
                    System.out.println("3.Ka Bixi Bill");
                    option = input.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("error ocurred ,please try agin");
                            break;
                        case 2:
                            System.out.println("fadlan geli lacagta");
                            money = input.nextInt();
                            System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay:$" + money + "?\n" + "1.haa" + "2.maya");
                            option = input.nextInt();
                            if (option == 1) {
                                if (money >balance )
                                    System.out.println("haraaga xisaabtaada kugu ma filana");
                                else
                                    System.out.println("waxaad bixisay bill \nlacagtiissu tahay $" + money +"Tar:"+currenDateAndTime+ "haraagaagu waa" + ((balance  - money)));
                            } else
                                System.out.println("mahadsanid");
                            break;
                        case 3:
                            System.out.println("fadlan geli numberka");
                            phone = input.nextInt();
                            System.out.println("fadlan geli lacagta");
                            money = input.nextInt();
                            System.out.println("Ma Hubtaa inaad bixisid bill \n lacagtiisu tahay $" + money + "oo laga rabo tel No" + phone + "\n 1.haa" + "\n 2.maya");
                            option = input.nextInt();
                            if (option == 1) {
                                if (money > balance )
                                    System.out.println("haraaga xisaabtaada kugu ma filana");
                                else
                                    System.out.println("waxaad bixisay bill lacagtiisu tahay $" + money + "oo laga rabay tel No" + phone +"Tar:"+currenDateAndTime+ "haraagaagu waa" + ((balance  - money)));
                            } else
                                System.out.println("mahadsanid!");
                            break;
                        default:
                            System.out.println("fadlan doora numberka sax ah");
                    }
                } else if (option == 2)
                    System.out.println("fadlan geli aqoosiga ganacsigaada");
                option= input.nextInt();
                //  seletion 4:wareeji EVCplus
            } else if (selection == 4) {
                System.out.println("fadlan geli numberka:");
                phone = input.nextInt();
                System.out.println("fadlan geli lacagta:");
                money = input.nextDouble();
                System.out.println("Ma Hubtaa inaad $" + money + " u wareejisid: "  + phone + "\n 1.haa" + "\n 2.maya");
                option= input.nextInt();
                if (option == 1) {
                    if (money > balance )
                        System.out.println("haraaga xisaabtaada kugu ma filana");
                    else
                        System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + phone +" Tar:"+currenDateAndTime + " haraagaagu waa $" + ((balance  - money)));
                } else
                    System.out.println("mahadsanid!");
                //selection 5 last action
            } else if (selection ==5) {
                System.out.println("1:Last Action");
                System.out.println("2:Wareejint udambeysay");
                System.out.println("3:Iibsashadii udambeysay");
                System.out.println("4:Last 3-Action");
                option=input.nextInt();
                if(option==1){
                }
            }
            //  seletion 6:salaam Bank
            else if (selection ==6){
                System.out.println("Salaam Bank");
                System.out.println("1.Itus Haraagaaga");
                System.out.println("2.Lacag dhigasho");
                System.out.println("3.Lacag qaadasho");
                System.out.println("4.Ka Wareeji EVCPLUS");
                System.out.println("5.Ka Wareeji Account-kaga");
                System.out.println("6.Hubi wareejin account");
                System.out.println("7.Maareynta bankiga");
                System.out.println("8.Kala Bax");
                option= input.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Fadlan gali  pinkaaga account-bangiga");
                        int pass= input.nextInt();
                        if(pass==4455){

                            System.out.println("Haraaga account-bangiga waa  $"+haraga_account);

                        }
                        else
                            System.out.println("pinka waa qalad");
                        break;

                    case 2:
                        System.out.println("fadlan geli lacagta");
                        money= input.nextInt();
                        System.out.println("Fadlan geli numberkaaga sirta ee bangiga");
                        pass= input.nextInt();
                        if (pass==4455){
                            System.out.println("Ma hubtaa inaad $" +money+ "dhigitid Account-kaaga bangiga?\n"+"1.haa\n"+"2.maya");
                            option= input.nextInt();
                            if (option==1)
                                System.out.println("waxaad account-kaga dhigatay"+money+"Haraagaga waa $"  +((haraga_account+money)));
                            else
                                System.out.println("mahadsanid");

                        }
                        else
                            System.out.println("numberka sirta waa qalad");
                        break;
                    case 3:
                        System.out.println("fadlan geli lacagta");
                        money= input.nextInt();
                        System.out.println("Fadlan geli numberkaaga sirta ee bangiga");
                        pass= input.nextInt();
                        if (pass==4455) {
                            System.out.println("Ma hubtaaa inaad $" + money + "ka qaadatid Account-kaaga Bangiga?\n" + "1.haa\n" + "2.maya");
                            option = input.nextInt();
                            if (option == 1)
                                System.out.println("Waxaad account-kaga ka qaadaty $" + money + "Haraagaaga waa $"  + ((haraga_account - money)));
                            else
                                System.out.println("mahadsanid");
                        }
                        else
                            System.out.println("numberka sirta waa qalad");
                        break;
                    case 4:
                        System.out.println("Fadlan dooro xisaabta Bangiga");
                        System.out.println("1.Darasalaam Bank");
                        System.out.println("2.Bank Beeraha");
                        System.out.println("3.SALAAM SOMALI BANK");
                        System.out.println("4.Salaam Sch");
                        option= input.nextInt();
                        break;
                    case 5:
                        System.out.println("Fadlan geli account ama mobile");
                        option= input.nextInt();
                        break;
                    case 6:
                        System.out.println("Fadlan geli Account-no");
                        option= input.nextInt();
                        break;
                    case  7:
                        System.out.println("Bedal lambarka sirta bankiga");
                        System.out.println("bedal luqadda");
                        System.out.println("lacag xirasho");
                        System.out.println("u celi lacag soo qaldanty");
                        option= input.nextInt();
                        break;
                    default:
                        System.out.println("fadlan dooro numberka saxda ah");
                }
            }
            // selection 7 maareynta
            else if (selection ==7){
                System.out.println("Maareynta");
                System.out.println("1.Bedal lambarka sirta ah");
                System.out.println("2.bedal luqadda");
                System.out.println("3.wargelin mobile lumay");
                System.out.println("4.lacag xirasho");
                System.out.println("5.u celi lacag soo qaldanty");
                System.out.println("6.EnableMobileBanking");
                option= input.nextInt();
                if (option==1) {
                    System.out.println("Fadlan geli pinkaaga cusub");
                    password = input.nextInt();
                    System.out.println("Hubikaaga cusub");
                    int pass = input.nextInt();
                    while (password != pass) {
                        System.out.println(" \n Hubi PIN-Kaaga cusub");
                        pass= input.nextInt();
                    }

                    System.out.println("waxaad ku guuleysaty inaad badasho PIN-kaaga");

                }
                else if (option==2) {
                    System.out.println("Fadlan dooro luqada");
                    System.out.println("1.English");
                    System.out.println("2.Somali");
                    option= input.nextInt();
                    if (option==1)
                        System.out.println("[-EVCPLUS-] you have successfully changed your language");
                    if (option==2)
                        System.out.println("[-EVCPLUS-] waad ku guulaysatay in aad badasho luqadda");}
                else if (option==3) {
                    System.out.println("Fadlan geli mobileka lumay");
                    phone= input.nextInt();
                    System.out.println("fadlan geli  sirta numberka");
                    int pas= input.nextInt();
                    System.out.println("Ma hubtaa in aad u diiwaan geliso lumid number-kan"+phone+"?\n"+"1.Haa\n"+"2.Maya");
                    option= input.nextInt();
                    if (option==1)
                        System.out.println("Waxaad ku guuleysatay inaad diwaan geliso  "  +phone+  "  "  +currenDateAndTime );
                    else
                        System.out.println("Mahadsanid");
                }
                else if (option==4) {
                    System.out.println("Fadlan geli numberka lagu Qalday");
                    phone= input.nextInt();
                    System.out.println("Fadlan geli numberka loo rabay");
                    phone= input.nextInt();
                    System.out.println("Ma hubtaa in aad xirto lacagtan?\n 1.Haa \n 2.Maya");
                    option= input.nextInt();
                    if (option==1)
                        System.out.println("Waxaad ku guuleysty inaad xirto lacagtan");
                    else
                        System.out.println("Mahsanid");
                }
                else if (option==5){
                    System.out.println("Fadlan geli aqoonsiga lacag diridda");
                    phone= input.nextInt();
                    while (phone != phone) {
                        System.out.println("invalid input format(length)\n fad geli aqoosiga");
                        phone = input.nextInt();
                    }
                    System.out.println("Fadlan geli macluumaad");
                    option= input.nextInt();
                    System.out.println("Ma hubtaa in aad celiso lacagtaan ?\n 1.haaa  \n 2.maya");
                    option= input.nextInt();
                    if (option==1)
                        System.out.println("Waxaad ku guuleysty inaad celiso lacagtan");
                    else
                        System.out.println("Mahsanid");
                }
                else if (option==6) {
                    System.out.println("Fadlan geli numberka is diwaan galinta ");
                    phone= input.nextInt();
                }
            }
            // seletion  8: Taaj
            else if (selection ==8) {
                System.out.println("TAAJ");
                System.out.println("1.Dibadda");
                System.out.println("2.Ogoow Khidmada");
                System.out.println("3.Macluumadka xawaaladda");
                option= input.nextInt();
                if (option==1){
                    System.out.println("fadlan geli numberka qaataha");
                    phone= input.nextInt();
                    System.out.println("fadlan geli magaca qaataha oo seddexan");
                    String full_name= input.nextLine();
                    System.out.println("Fadlan geli magaalada qaataha");
                    String magaalada= input.nextLine();
                    System.out.println("Fadlan geli lacagta");
                    money= input.nextInt();
                    System.out.println("fadlan geli macluumaad");
                    option= input.nextInt();
                    System.out.println("Khidmada ma xisaabtaada ayaa laga jarayaa?\n 1.haa \n 2.maya");
                    option= input.nextInt();
                }
                else if (option==2) {
                    System.out.println("fadlan doora shirkada");
                    System.out.println("1.pay to evcplus");
                    System.out.println("2.TAAJ");
                    System.out.println("3.taajpay");
                    System.out.println("4.new etaaj");
                    System.out.println("5.taaj ips");
                    option= input.nextInt();
                    if(option==1){
                        System.out.println("fadlan geli teleefanka qaataha");
                        phone= input.nextInt();
                        System.out.println("fadlan geli lacagta");
                        money= input.nextInt();

                    }
                }
                else if (option==3) {
                    System.out.println("Fadlan geli aqoonsiga lacag dirida");
                    option = input.nextInt();
                }

            }

  }
}

}