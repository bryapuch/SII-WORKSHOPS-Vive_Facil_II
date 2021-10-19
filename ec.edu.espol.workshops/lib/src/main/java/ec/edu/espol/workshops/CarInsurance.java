package ec.edu.espol.workshops;


public class CarInsurance {
    int age;
    String sex;
    String estadoCivil;
    int prima;
    boolean documento;

    public CarInsurance(int age, String sex, String estadoCivil, boolean documento) {
        this.age=age;
        this.sex=sex;
        this.estadoCivil=estadoCivil;
        this.documento=documento;
    }


    public int calcInsurace(){
        prima=500;
        if(sex=="M" && estadoCivil=="No_casado" && age<=25){
            prima+=1500;
        }
        if(sex=="F" || estadoCivil=="Casado"){
            prima-=200;
        }
        if(age>=45 && age<65){
            prima-=100;
        }

        return prima;
    }

    public int datosValidos(){
        if(age>80){
            return -1;
        }
        if(!documento){
            return -1;
        }
        return calcInsurace();
    }

    //getters & setters

    getAge(){
        return this.age;
    }

    getSex(){
        return this.sex;
    }

    getPrima(){
        return this.prima;
    }

    getEstadoCivil(){
        return this.estadoCivil;
    }

    getDocumento(){
        return this.documento;
    }

    setAge(int age){
        this.age=age;
        return this.age;
    }

    setSex(String sex){
        this.sex=sex;
        return this.sex;
    }

    setEstadoCivil(String estadoCivil){
        this.estadoCivil=estadoCivil;
        return this.estadoCivil;
    }
    
    setPrima(int prima){
        this.prima=prima;
        return this.prima;
    }

    setDocumento(boolean documento){
        this.documento=documento;
        return this.documento
    }




    

}

