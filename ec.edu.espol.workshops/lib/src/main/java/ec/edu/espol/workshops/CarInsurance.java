package ec.edu.espol.workshops;


public class CarInsurance {
  int age;
  String sex;
  String estadoCivil;
  int prima;
  boolean documento;

  public CarInsurance(int age, String sex, String estadoCivil, boolean documento) {
    this.age = age;
    this.sex = sex;
    this.estadoCivil = estadoCivil;
    this.documento = documento;
  }


  public int calcInsurace() {
    prima = 500;
    if(sex.equals("M") && estadoCivil.equals("No_casado") && age<=25){
      prima += 1500;
    }
    if(sex.equals("F") || estadoCivil.equals("Casado")){
      prima -= 200;
    }
    if(age>=45 && age<65){
      prima -= 100;
    }

    return prima;
  }

  public int datosValidos() { 
    if (age > 80) {
      return -1;
    }
    if (!documento) {
      return -1;
    }
    return calcInsurace();
  }

  //getters & setters

  public int getAge() {
    return this.age;
  }

  public String getSex() {
    return this.sex;
  }

  public int getPrima() {
    return this.prima;
  }

  public String getEstadoCivil() {
    return this.estadoCivil;
  }

  public boolean getDocumento() {
    return this.documento;
  }

  public int setAge(int age) {
    this.age = age;
    return this.age;
  }

  public String setSex(String sex) {
    this.sex = sex;
    return this.sex;
  }

  public String setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this.estadoCivil;
  }
    
  public int setPrima(int prima) {
    this.prima = prima;
    return this.prima;
  }

  public boolean setDocumento(boolean documento) {
    this.documento = documento;
    return this.documento;
  }




    

}

