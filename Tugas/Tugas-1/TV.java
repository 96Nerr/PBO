class TV {

    //atributnya
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;    

    //contructornya
    public TV() {

    }

    //nyalain tv
    public void turnOn() {
        on = true;
    }

    //matiin tv
    public void turnOff(){
        on = false;
    }

    //set channel
    public void setChannel (){


    }

    //set volume
    public void setVolume(){

    }

    //naikin channel
    public void channelUp(){

    }

    //turun channel
    public void channelDown(){

    }

    //naikin volume
    public void volumeUp(){
        if (on && volumeLevel < 7){
            volumeLevel++;

        }
    }

    //turunin volume
    public void volumeDown(){

    }
    
}

