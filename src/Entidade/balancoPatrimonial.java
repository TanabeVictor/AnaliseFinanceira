package Entidade;

public class balancoPatrimonial {
  public float ativoCirc, ativoNC, passivoCirc, passivoNC, patrimonioLiquido;

  public balancoPatrimonial(float Cad_ativoCirc, float Cad_ativoNC, float Cad_passivoCirc, float Cad_passivoNC, float Cad_patrimonioLiquido) throws Exception {
    setAtivoCirc(Cad_ativoCirc);
    setAtivoNC(Cad_ativoNC);
    setPassivoCirc(Cad_passivoCirc);
    setPassivoNC(Cad_passivoNC);
    setPatrimonioLiquido(Cad_patrimonioLiquido);}
  
    public void setAtivoCirc(float P_ativoCirc)     { ativoCirc = P_ativoCirc; }
    public void setAtivoNC(float P_ativoNC)            { ativoNC = P_ativoNC; }
    public void setPassivoCirc(float P_passivoCirc)       { passivoCirc = P_passivoCirc; }
    public void setPassivoNC(float P_passivoNC)              { passivoNC = P_passivoNC; }
    public void setPatrimonioLiquido(float P_patrimonioLiquido)  { patrimonioLiquido = P_patrimonioLiquido; }
    
    public float getAtivoCirc()                { return ativoCirc;      }
    public float getAtivoNC()                  { return ativoNC;        }
    public float getPassivoCirc()              { return passivoCirc;    }
    public float getPassivoNC()                { return passivoNC;      }
    public float getPatrimonioLiquido()        { return patrimonioLiquido;}}
