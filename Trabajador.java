// Uniersidad del Valle de Guatemala
// Paolo Antonio Consuegra Castillo
// 221097
// 18 de nomviembre
// Laboratorio Sustituto


public class Trabajador{
/*Atributos */
    private String nombre;
    private String tipo;
    private boolean liderazgo;
    private boolean colaboracion;
    private boolean companerismo;
    private boolean experiencia;
    private boolean conocimiento;
    private boolean creatividad;
    private boolean barato;
    private boolean profesional;
    private boolean completo;

/*Constructor con parametros */
    public Trabajador(String nombre, String tipo, boolean liderazgo, boolean colaboracion, boolean companerismo, boolean experiencia, boolean conocimiento, boolean creatividad, boolean barato, boolean profesional, boolean completo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.liderazgo = liderazgo;
        this.colaboracion = colaboracion;
        this.companerismo = companerismo;
        this.experiencia = experiencia;
        this.conocimiento = conocimiento;
        this.creatividad = creatividad;
        this.barato = barato;
        this.profesional = profesional;
        this.completo = completo;
    }
/*Constructor sin parametros */
    public Trabajador() {
        this.nombre = "";
        this.tipo = "";
        this.liderazgo = false;
        this.colaboracion = false;
        this.companerismo = false;
        this.experiencia = false;
        this.conocimiento = false;
        this.creatividad = false;
        this.barato = false;
        this.profesional = false;
        this.completo = false;

    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getTipo() {
        return this.tipo;
    }

    
    /** 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isLiderazgo() {
        return this.liderazgo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getLiderazgo() {
        return this.liderazgo;
    }

    
    /** 
     * @param liderazgo
     */
    public void setLiderazgo(boolean liderazgo) {
        this.liderazgo = liderazgo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isColaboracion() {
        return this.colaboracion;
    }

    
    /** 
     * @return boolean
     */
    public boolean getColaboracion() {
        return this.colaboracion;
    }

    
    /** 
     * @param colaboracion
     */
    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCompanerismo() {
        return this.companerismo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCompanerismo() {
        return this.companerismo;
    }

    
    /** 
     * @param companerismo
     */
    public void setCompanerismo(boolean companerismo) {
        this.companerismo = companerismo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isExperiencia() {
        return this.experiencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean getExperiencia() {
        return this.experiencia;
    }

    
    /** 
     * @param experiencia
     */
    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean isConocimiento() {
        return this.conocimiento;
    }

    
    /** 
     * @return boolean
     */
    public boolean getConocimiento() {
        return this.conocimiento;
    }

    
    /** 
     * @param conocimiento
     */
    public void setConocimiento(boolean conocimiento) {
        this.conocimiento = conocimiento;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCreatividad() {
        return this.creatividad;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCreatividad() {
        return this.creatividad;
    }

    
    /** 
     * @param creatividad
     */
    public void setCreatividad(boolean creatividad) {
        this.creatividad = creatividad;
    }

    
    /** 
     * @return boolean
     */
    public boolean isBarato() {
        return this.barato;
    }

    
    /** 
     * @return boolean
     */
    public boolean getBarato() {
        return this.barato;
    }

    
    /** 
     * @param barato
     */
    public void setBarato(boolean barato) {
        this.barato = barato;
    }

    
    /** 
     * @return boolean
     */
    public boolean isProfesional() {
        return this.profesional;
    }

    
    /** 
     * @return boolean
     */
    public boolean getProfesional() {
        return this.profesional;
    }

    
    /** 
     * @param profesional
     */
    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCompleto() {
        return this.completo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCompleto() {
        return this.completo;
    }

    
    /** 
     * @param completo
     */
    public void setCompleto(boolean completo) {
        this.completo = completo;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "\n" +
            "nombre: " + getNombre() + "\n" +
            "tipo: " + getTipo() + "\n";
    }
    




}

    


    


