/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callback;

/**
 *
 * @author user
 */
public class CallBack {

    
    public static void main(String[] args) throws  Exception{
        
      
        new CallBack().doWork(new Callback() { //implementing class            
            @Override
            public void onStart(String text) {
                System.out.println("callback called:" + " " + text);            
            }
            
            @Override
            public void onEnd(String text2) {
                System.out.println("callback called:" + " " + text2);            
            }
        });
    }

    public void doWork(Callback callback) {
        callback.onStart("maxime2");
        System.out.println("doing work");
        callback.onEnd("maxime2");
    }

    public interface Callback {
        void onStart(String text);
        void onEnd(String text2);
    }
        
        /**
    
   
        substract(10, 7, new CalculListener(){
            @Override
            public void onPositiveREsult() {
                System.out.println("C'est bien");
            }

            @Override
            public void onNegativeResult() {
                System.out.println("attetntion");
             }
        
        
        
        });
   } 
   * 
   * 
* 
    private static void substract(int a, int b, CalculListener listener) {

         int result = a - b;
         
         System.out.println("Le resultat de cette soustraction est: " +result);
     
         if(result > 0){
         
             System.out.println("le resultat est positif");
             listener.onPositiveREsult();
             
         } else {
             System.out.println("Le resultat est negatif");
             listener.onNegativeResult();
         }
    }
    
}






























*/
        
        
/*

    Scanner in = new Scanner(System.in);
       Scanner str = new Scanner(System.in);
       System.out.println("Entre 1 pour copier ou 2 pour couper");
         
       choix = in.nextInt();
       rep = in.nextInt();
     
   
     System.out.println("Vous avez saisi : " + choix); 
  
       
      if(choix != 1 && choix != 2)
          System.out.println("Entre 1 pour copier ou 2 pour couper"); 
      
       else{
        if(choix == 1){
             System.out.println("vous aviez entrer Copy");
              
             switch (rep){
               case 5:
                 System.out.println("Entre le path du dossier");
                source= str.nextLine();              //reads string 
                   
                 System.out.println("Entre le path du dossier de destination");
                 String target= str.nextLine(); 
                 File sourceFile = new File(source);
                   System.out.println(sourceFile);
                 String name = sourceFile.getName();
                 File targetRepo = new File(target+name);

                 
                    System.out.println("Copying file : " + sourceFile.getName() +" from Java Program");
     
                 try {
                     //copy file from one location to other
                  
                     FileUtils.copyFile(sourceFile, targetRepo);
                 } catch (IOException ex) {
                     Logger.getLogger(Exercice0.class.getName()).log(Level.SEVERE, null, ex);
                 }
                
                   
                 
                  break;
                  case 6: 
                   System.out.println("Creer le path du dossier");
                   
                    String source1= str.nextLine();              //reads string 

                    System.out.println("Entre le path du dossier de destination");
                    String target1= str.nextLine(); 
                    File sourceFile1 = new File(source1);
                      System.out.println(sourceFile1);
                    String name1 = sourceFile1.getName();
                    File targetRepo1 = new File(target1);
                  

                   
                     String path2 = str.nextLine(); 
                     File dossier = new File(path2); 
                     boolean res = targetRepo1.mkdir();
                          
                     if(res) {
                            
                      try {
                     //copy file from one location to other
                       
                     
                       FileUtils.copyFile(sourceFile1, targetRepo1);
                       
                              } catch (IOException ex) {
                                  
                        Logger.getLogger(Exercice0.class.getName()).log(Level.SEVERE, null, ex);
                        }  
                            System.out.println("Le dossier a ete creer.");
                        }else {
                           System.out.println("Le dossier existe déja.");
               }  
            }
               
             
             
         }if(choix == 2){
             System.out.println("Coupure avier entrer coupure");
             
             
              switch (rep){
               case 5:
                 System.out.println("Entre le path du dossier");
                 sourceCut= str.nextLine();              //reads string 
                   
                 System.out.println("Entre le path du dossier de destination");
                 String target= str.nextLine(); 
                 File sourceFile = new File(sourceCut);
                   System.out.println(sourceFile);
                 String name = sourceFile.getName();
                 File targetRepo = new File(target+name);

                 
                    System.out.println("Copying file : " + sourceFile.getName() +" from Java Program");
     
                 try {
                     //copy file from one location to other
                     FileUtils.moveFile(sourceFile, targetRepo);
                  
                 } catch (IOException ex) {
                     Logger.getLogger(Exercice0.class.getName()).log(Level.SEVERE, null, ex);
                 }
                
                   
                 
                  break;
                  case 6: 
                   System.out.println("Creer le path du dossier");
                   
                    String source1= str.nextLine();              //reads string 

                    System.out.println("Entre le path du dossier de destination");
                    String target1= str.nextLine(); 
                    File sourceFile1 = new File(source1);
                      System.out.println(sourceFile1);
                    String name1 = sourceFile1.getName();
                    File targetRepo1 = new File(target1);
                  

                   
                     String path2 = str.nextLine(); 
                     File dossier = new File(path2); 
                     boolean res = targetRepo1.mkdir();
                          
                     if(res) {
                            
                      try {
                     //copy file from one location to other
                      
                       FileUtils.copyFile(sourceFile1, targetRepo1);
                       
                              } catch (IOException ex) {
                                  
                        Logger.getLogger(Exercice0.class.getName()).log(Level.SEVERE, null, ex);
                        }  
                            System.out.println("Le dossier a ete creer.");
                        }else {
                           System.out.println("Le dossier existe déja.");
               }
              }
             
             
         }
      } */




        
         /*File dossier = new File("D:\\Java\\dsis"); 
    boolean res = dossier.mkdir();
    
    if(res) {
      System.out.println("Le dossier a été créé.");
    }
    else {
      System.out.println("Le dossier existe déja.");
    } */
     
         /*  
      String source = "D:/java/data2.txt";
        //directory where file will be copied
        String target ="D:/java2/";
     
        //name of source file
        File sourceFile = new File(source);
        String name = sourceFile.getName();
     
        File targetFile = new File(target+name);
        System.out.println("Copying file : " + sourceFile.getName() +" from Java Program");
     
        try {
            //copy file from one location to other
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (IOException ex) {
            Logger.getLogger(Exercice0.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(sourceFile);
        */
         
    
}
