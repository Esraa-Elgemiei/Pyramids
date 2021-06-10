/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

/**
 *
 * @author Esraa Abdulfatah
 */
public class Pyramid {
    private String pharaoh;
    private String modern_name;
    private String site;
    private double height;

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public Pyramid(){
    }

    public Pyramid(String pharaoh,String modern_name,String site,double height){
       setPharaoh(pharaoh);
       setModern_name(modern_name);
       setSite(site);
       setHeight(height);
   }
   
    
}
