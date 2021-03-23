package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String seccion;
    private String editor;
       
    public String getSecciones(){
     return seccion;
    }
    
    public void setSecciones(String secc){
       seccion = secc;
    }
    
    public String getEditor(){
     return editor;
    }
    
    public void setEditor(String edit){
        editor = edit;
    }
    
    @Override
    public String getPeriodicidad()
    {
     return periodicidad;
    }
    
}