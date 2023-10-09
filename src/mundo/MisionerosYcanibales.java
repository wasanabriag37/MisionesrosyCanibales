

package mundo;

import gfutria.Logic;

public class MisionerosYcanibales extends Logic
{ // Atributos
     private int misi, cani, ori, misd, cand;
  // Constructores
     public MisionerosYcanibales()
     {        
     }        

     public MisionerosYcanibales(int mi, int ci, int o, int md, int cd)
     { this.misi = mi;
       this.cani = ci;
       this.ori = o;
       this.misd = md;
       this.cand = cd;  
     }        
   
  // Metodos getter & setter
    public int getMisI() {
        return misi;
    }

    public void setMisI(int misi) {
        this.misi = misi;
    }

    public int getMisD() {
        return misd;
    }

    public void setMisD(int misd) {
        this.misd = misd;
    }
   
    public int getCanI() {
        return cani;
    }

    public void setCanI(int cani) {
        this.cani = cani;
    }

    public int getCanD() {
        return cand;
    }

    public void setCanD(int cand) {
        this.cand = cand;
    }
   
    public int getOri() {
        return ori;
    }

    public void setOri(int ori) {
        this.ori = ori;
    }

  // Metodos de comportamiento misioneros canibales
     public void llevar10() /*A1*/
     {
       if (ori == 1)
       {
          if ((misi-1 >= cani) && (misd+1 >= cand)){
              misi = misi-1;
              misd = misd+1;
              ori = 0;
          }
       }
       else
       {
           if ((misd-1<= cand) && (misi==2))
           {
               misd = misd-1;
               misi = misi+1;
               ori = 1;
           }
       }
     }
     public void llevar01() /*A2*/
     {
       if (ori == 1)
       {
          if ((cani-1 >= misi) && (cand+1 >= misd)){
              cani = cani-1;
              cand = cand+1;
              ori = 0;
          }
       }
       else
       {
           if ((cand-1>= misd) && (cani+1 <= misi))
           {
               cand = cand-1;
               cani = cani+1;
               ori = 1;
           }
           else
           {
               if ((cand-1<= misd) && (cani-2 == misi))
                {
                    cand = cand-1;
                    cani = cani+1;
                    ori = 1;
                }
               else
               {
                   if ((cand-1<= misd) && (cani-1 == misi))
                    {
                        cand = cand-1;
                        cani = cani+1;
                        ori = 1;
                    }
               }
           }
       }
     }
     public void llevar20() /*A3*/
     {
       if (ori == 1)
       {
          if ((misi-2 >= cani) && (misd+2 >= cand)){
              misi = misi-2;
              misd = misd+2;
              ori = 0;
          }
          else
              if ((misi == cani) && (misd == cand))
              {
                misi = misi-2;
                misd = misd+2;
                ori = 0;
              }
       }
       else
       {
           if ((misd-2>= cand) && (misi+2 >= cani))
           {
               misd = misd-2;
               misi = misi+2;
               ori = 1;
           }
       }
     }
     public void llevar02() /*A4*/
     {
       if (ori == 1)
       {
          if ((cani-2 <= misi) && (cand+2 > misd+2)){
              cani = cani-2;
              cand = cand+2;
              ori = 0;
          }
          else
          {
             if ((misi == 0 && cani == 2) && (misd == 3 && cand == 1))
                  {
                    cani = cani-2;
                    cand = cand+2;
                    ori = 0;
                  }
              else
              {
                 if ((misi == 0 && cani == 3) && (misd == 3 && cand == 0))
                  {
                    cani = cani-2;
                    cand = cand+2;
                    ori = 0;
                  }  
              }
          }
       }
       else
       {
           if ((cand-2>= misd) && (cani+2 >= misi))
           {
               cand = cand-2;
               cani = cani+2;
               ori = 1;
           }
       }
     }
     public void llevar11() /*A5*/
     {
         if (ori == 1)
       {
           if (cand == 0 && misd == 0)
           {
                misi = misi-1;
                cani = cani-1;
                misd = misd+1;
                cand = cand+1;
                ori = 0;
           }
       }
       else
       {
           if (cand == 2 && misd == 2)
           {
                misi = misi+1;
                cani = cani+1;
                misd = misd-1;
                cand = cand-1;
                ori = 1;
           }
       }
     }  
     
  // Metodos de la clase Logic  
    public void action(int index)
    { switch (index)
      { case 1:
         llevar10(); break;          
        case 2:
         llevar01(); break;          
        case 3:
         llevar20(); break;          
        case 4:
         llevar02(); break;
        case 5:
         llevar11(); break;  
      }        
    }
   
     @Override
    public String state()
    { return misi + "" + cani + "" + ori + "" + misd + "" + cand;  
    }
   
     @Override
    public Logic cloneObject(Logic object)
    { MisionerosYcanibales obj = (MisionerosYcanibales)object;
      MisionerosYcanibales objClone;
      objClone = new MisionerosYcanibales();
      objClone.setMisI(obj.getMisI());
      objClone.setCanI(obj.getCanI());
      objClone.setOri(obj.getOri());
      objClone.setMisD(obj.getMisD());
      objClone.setCanD(obj.getCanD());
     
      return objClone;        
    }        
}