package sozdetersi;


public class Determinant {
    
    public double det(double matris[][]){
        double result = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        double result5 = 0;
        double sum1,sum2;
        double[][] yeni = new double[3][3];
        double[][] yeni2 = new double[3][3];
        double[][] yeni3 = new double[3][3];
        double[][] yeni4 = new double[3][3];
        double[][] yedek = new double[4][4];
        double[][] yedek2 = new double[4][4];
        double[][] yedek3 = new double[4][4];
        double[][] yedek4 = new double[4][4];
        double[][] yedek5 = new double[4][4];
        int i,j;
        
        switch (matris.length) {
            case 1:
                result=matris[0][0];
                return result;
            case 2:
                result2=(matris[0][0]*matris[1][1])-(matris[0][1]*matris[1][0]);
                return result2;
            case 3:
                sum1=(matris[0][0]*matris[1][1]*matris[2][2])+(matris[0][1]*matris[1][2]*matris[2][0])+(matris[0][2]*matris[1][0]*matris[2][1]);
                sum2=(matris[0][2]*matris[1][1]*matris[2][0])+(matris[1][2]*matris[2][1]*matris[0][0])+(matris[2][2]*matris[0][1]*matris[1][0]);
                result3=sum1-sum2;
                return result3;   
            case 4:
                yeni[0][0]=matris[1][1];
                yeni[0][1]=matris[1][2];
                yeni[0][2]=matris[1][3];
                yeni[1][0]=matris[2][1];
                yeni[1][1]=matris[2][2];
                yeni[1][2]=matris[2][3];
                yeni[2][0]=matris[3][1];
                yeni[2][1]=matris[3][2];
                yeni[2][2]=matris[3][3];
                
                /*System.out.println("");
                System.out.println("Yeni 1:");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print(+yeni[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yeni matrisinin determinantı :"+det(yeni));*/
                
                yeni2[0][0]=matris[1][0];
                yeni2[0][1]=matris[1][2];
                yeni2[0][2]=matris[1][3];
                yeni2[1][0]=matris[2][0];
                yeni2[1][1]=matris[2][2];
                yeni2[1][2]=matris[2][3];
                yeni2[2][0]=matris[3][0];
                yeni2[2][1]=matris[3][2];
                yeni2[2][2]=matris[3][3];
                
                
               /* System.out.println("");
                System.out.println("Yeni 2:");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print(yeni2[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yeni2 matrisinin determinantı :"+det(yeni2));*/
                
                yeni3[0][0]=matris[1][0];
                yeni3[0][1]=matris[1][1];
                yeni3[0][2]=matris[1][3];
                yeni3[1][0]=matris[2][0];
                yeni3[1][1]=matris[2][1];
                yeni3[1][2]=matris[2][3];
                yeni3[2][0]=matris[3][0];
                yeni3[2][1]=matris[3][1];
                yeni3[2][2]=matris[3][3];
                
               /*System.out.println("");
                System.out.println("Yeni 3:");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print(yeni3[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yeni3 matrisinin determinantı :"+det(yeni3));*/
                
                yeni4[0][0]=matris[1][0];
                yeni4[0][1]=matris[1][1];
                yeni4[0][2]=matris[1][2];
                yeni4[1][0]=matris[2][0];
                yeni4[1][1]=matris[2][1];
                yeni4[1][2]=matris[2][2];
                yeni4[2][0]=matris[3][0];
                yeni4[2][1]=matris[3][1];
                yeni4[2][2]=matris[3][2];
                
                /*System.out.println("");
                System.out.println("Yeni 4:");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print(yeni4[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yeni4 matrisinin determinantı :"+det(yeni4));*/
                
                result4 = (matris[0][0]*det(yeni))-(matris[0][1]*det(yeni2))+(matris[0][2]*det(yeni3))-(matris[0][3]*det(yeni4));
                /*System.out.println("");
                System.out.println("Result4  :"+result4);*/
                return result4; 
                
            case 5:
                yedek[0][0]=matris[1][1];
                yedek[0][1]=matris[1][2];
                yedek[0][2]=matris[1][3];
                yedek[0][3]=matris[1][4];
                yedek[1][0]=matris[2][1];
                yedek[1][1]=matris[2][2];
                yedek[1][2]=matris[2][3];
                yedek[1][3]=matris[2][4];
                yedek[2][0]=matris[3][1];
                yedek[2][1]=matris[3][2];
                yedek[2][2]=matris[3][3];
                yedek[2][3]=matris[3][4];
                yedek[3][0]=matris[4][1];
                yedek[3][1]=matris[4][2];
                yedek[3][2]=matris[4][3];
                yedek[3][3]=matris[4][4];
                
                /*System.out.println("");
                System.out.println("Yedek 1:");
                for(i=0;i<4;i++){
                    for(j=0;j<4;j++){
                        System.out.print(yedek[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yedek1 matrisinin determinantı :"+det(yedek));*/
                
                yedek2[0][0]=matris[1][0];
                yedek2[0][1]=matris[1][2];
                yedek2[0][2]=matris[1][3];
                yedek2[0][3]=matris[1][4];
                yedek2[1][0]=matris[2][0];
                yedek2[1][1]=matris[2][2];
                yedek2[1][2]=matris[2][3];
                yedek2[1][3]=matris[2][4];
                yedek2[2][0]=matris[3][0];
                yedek2[2][1]=matris[3][2];
                yedek2[2][2]=matris[3][3];
                yedek2[2][3]=matris[3][4];
                yedek2[3][0]=matris[4][0];
                yedek2[3][1]=matris[4][2];
                yedek2[3][2]=matris[4][3];
                yedek2[3][3]=matris[4][4];
                
                /*System.out.println("");
                System.out.println("Yedek 2:");
                for(i=0;i<4;i++){
                    for(j=0;j<4;j++){
                        System.out.print(yedek2[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yedek2 matrisinin determinantı :"+det(yedek2));*/
                
                yedek3[0][0]=matris[1][0];
                yedek3[0][1]=matris[1][1];
                yedek3[0][2]=matris[1][3];
                yedek3[0][3]=matris[1][4];
                yedek3[1][0]=matris[2][0];
                yedek3[1][1]=matris[2][1];
                yedek3[1][2]=matris[2][3];
                yedek3[1][3]=matris[2][4];
                yedek3[2][0]=matris[3][0];
                yedek3[2][1]=matris[3][1];
                yedek3[2][2]=matris[3][3];
                yedek3[2][3]=matris[3][4];
                yedek3[3][0]=matris[4][0];
                yedek3[3][1]=matris[4][1];
                yedek3[3][2]=matris[4][3];
                yedek3[3][3]=matris[4][4];
                
                /*System.out.println("");
                System.out.println("Yedek 3:");
                for(i=0;i<4;i++){
                    for(j=0;j<4;j++){
                        System.out.print(yedek3[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yedek3 matrisinin determinantı :"+det(yedek3));*/
                
                yedek4[0][0]=matris[1][0];
                yedek4[0][1]=matris[1][1];
                yedek4[0][2]=matris[1][2];
                yedek4[0][3]=matris[1][4];
                yedek4[1][0]=matris[2][0];
                yedek4[1][1]=matris[2][1];
                yedek4[1][2]=matris[2][2];
                yedek4[1][3]=matris[2][4];
                yedek4[2][0]=matris[3][0];
                yedek4[2][1]=matris[3][1];
                yedek4[2][2]=matris[3][2];
                yedek4[2][3]=matris[3][4];
                yedek4[3][0]=matris[4][0];
                yedek4[3][1]=matris[4][1];
                yedek4[3][2]=matris[4][2];
                yedek4[3][3]=matris[4][4];
                
                /*System.out.println("");
                System.out.println("Yedek 4:");
                for(i=0;i<4;i++){
                    for(j=0;j<4;j++){
                        System.out.print(yedek4[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yedek4 matrisinin determinantı :"+det(yedek4));*/
                
                yedek5[0][0]=matris[1][0];
                yedek5[0][1]=matris[1][1];
                yedek5[0][2]=matris[1][2];
                yedek5[0][3]=matris[1][3];
                yedek5[1][0]=matris[2][0];
                yedek5[1][1]=matris[2][1];
                yedek5[1][2]=matris[2][2];
                yedek5[1][3]=matris[2][3];
                yedek5[2][0]=matris[3][0];
                yedek5[2][1]=matris[3][1];
                yedek5[2][2]=matris[3][2];
                yedek5[2][3]=matris[3][3];
                yedek5[3][0]=matris[4][0];
                yedek5[3][1]=matris[4][1];
                yedek5[3][2]=matris[4][2];
                yedek5[3][3]=matris[4][3];
                
                /*System.out.println("");
                System.out.println("Yedek 5:");
                for(i=0;i<4;i++){
                    for(j=0;j<4;j++){
                        System.out.print(yedek5[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Yedek5 matrisinin determinantı :"+det(yedek5));*/
                
               
                result5 = (matris[0][0]*det(yedek))-(matris[0][1]*det(yedek2))+(matris[0][2]*det(yedek3))-(matris[0][3]*det(yedek4))+(matris[0][4]*det(yedek5));
                /*System.out.println("");
                System.out.println("Result5  :"+result5);*/
                
                return result5;
            default:
                return -1;   
        }
    }
    
}
