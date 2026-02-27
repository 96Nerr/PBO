class TV {

    //atributnya
    int channel = 1;
    int VolumeLevel = 1;
    boolean on = false;    

    //contructornya
    public TV() {

    }

    //nyalain tv
    public void turnOn() {
        on = true;
    }

    public void turnOff(){
        on = false;
    }

}

