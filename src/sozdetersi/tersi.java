/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sozdetersi;

/**
 *
 * @author uset
 */
public class tersi {
    
    double[][] carpim_yedek;
    double[][] carpim2_yedek;
    double[][] yeni_matris;
    double[][] yeni_matris2;
    public static int toplam=0;
    public static int carpim_sayisi=0;
    
    public static double[][] invert(double a[][]) 
    {
        toplam=0;
        carpim_sayisi=0;
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i) 
            b[i][i] = 1;
 
 // Transform the matrix into an upper triangle
 //Matris üst üçgene çevrilir
        gaussian(a, index);
 
 // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i){
            for (int j=i+1; j<n; ++j){
                for (int k=0; k<n; ++k){
                    b[index[j]][k]-= a[index[j]][i]*b[index[i]][k];
                    toplam++;
                }
            }
        }
 // Perform backward substitutions
        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            carpim_sayisi++;
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k) 
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                    carpim_sayisi++;
                    toplam++;
                }
                x[j][i] /= a[index[j]][j];
                carpim_sayisi++;
            }
        }
        
       return x;
    }
 
// Method to carry out the partial-pivoting Gaussian
// elimination.  Here index[] stores pivoting order.
 
    public static void gaussian(double a[][], int index[]) 
    {
        int n = index.length;
        double c[] = new double[n];
 
 // Initialize the index
        for (int i=0; i<n; ++i) 
            index[i] = i;
 
 // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }
 
 // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                carpim_sayisi++;
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }
 
   // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i) 	
            {
                double pj = a[index[i]][j]/a[index[j]][j];
                carpim_sayisi++;
 // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;
 
 // Modify other elements accordingly
                for (int l=j+1; l<n; ++l){
                    a[index[i]][l] -= pj*a[index[j]][l];
                    toplam++;
                }
            }
        }
    }
    
    public double[][] yontem1(double[][] matris,double[][] transpoz,int boyut1,int boyut2){
        int i,j;
        
        //Matris ile transpozunun çarpımlarının boyutları kadar boyutları olan bir matris oluşturulur
        yeni_matris = new double[boyut2][boyut2];
        //Program her çalıştırıldığında eski verilerin kaybolması için 0 atanır
        for(i=0;i<boyut2;i++){
            for(j=0;j<boyut2;j++){
                yeni_matris[i][j]=0;
            }
        }
        //Sonrasında bu matrisin tersi alınır
        yeni_matris = invert(matris);
        
        //Sözde tersi için matris oluşturulur
        double[][] pseudo = new double[boyut2][boyut1];
        //Program her çalıştırıldığında eski verilerin kaybolması için 0 atanır
        for(i=0;i<boyut2;i++){
            for(j=0;j<boyut1;j++){
                pseudo[i][j]=0;
            }
        }
        //Tersi alınan çarpım matrisiyle transpozu çarpılır
        for(i=0;i<boyut2;i++){
            for(j=0;j<boyut1;j++){
                for(int k=0;k<boyut2;k++){
                    pseudo[i][j] += yeni_matris[i][k]*transpoz[k][j];
                    carpim_sayisi++;
                    toplam++;
                }
            }
        }
        //Böylece sözde tersi bulunur
        return pseudo;
    }
    
    public double[][] yontem2(double[][] matris,double[][] transpoz,int boyut1,int boyut2){
        int i,j;
        double[][] carpim2 = new double[boyut1][boyut1];
        carpim2_yedek = new double[boyut1][boyut1];
        
        
        //Program her çalıştırıldığında eski verilerin kaybolması için 0 atanır
        for(i=0;i<boyut1;i++){
            for(j=0;j<boyut1;j++){
                carpim2[i][j]=0;
            }
        }
        //Transpozu ile matrisin çarpımının determinantı 0 çıktığı için matris ile transpoz çarpılır
        for(i=0;i<boyut1;i++){
            for(j=0;j<boyut1;j++){
                for(int k=0;k<boyut2;k++){
                    carpim2[i][j] += matris[i][k]*transpoz[k][j];
                    carpim_sayisi++;
                    toplam++;
                }
            }
        }
        
        //Çarpımı ekrandaki tabloda gösterebilmek için yedeği alınır
        for(i=0;i<boyut1;i++){
            for(j=0;j<boyut1;j++){
                carpim2_yedek[i][j]=carpim2[i][j];
            }
        }
        //Çarpımın tersini tutmak için bir matris oluşturulur
        yeni_matris2= new double[boyut1][boyut1];
        //Program her çalıştırıldığında eski verilerin kaybolması için 0 atanır
        for(i=0;i<boyut1;i++){
            for(j=0;j<boyut1;j++){
                yeni_matris2[i][j]=0;
            }
        }
        //Çarpım matrisinin tersi alınır
        yeni_matris2 = invert(carpim2);
        //Sözde tersi tutmak için matris oluşturulur
        double[][] pseudo2 = new double[boyut2][boyut1];
        //Program her çalıştırıldığında eski verilerin kaybolması için 0 atanır
        for(i=0;i<boyut2;i++){
            for(j=0;j<boyut1;j++){
                pseudo2[i][j]=0;
            }
        }
        //Transpoz ile çarpımın tersi çarpılarak sözde tersi bulunur
        for(i=0;i<boyut2;i++){
            for(j=0;j<boyut1;j++){
                for(int k=0;k<boyut1;k++){
                    pseudo2[i][j] += transpoz[i][k]*yeni_matris2[k][j];
                    toplam++;
                    carpim_sayisi++;
                }
            }
        }
        
        return pseudo2;
        
    }
    
    
}

