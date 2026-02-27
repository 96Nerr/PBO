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
    public void setChannel (int newChannel){
        if (on && newChannel <= 120){
            channel = newChannel;
        }  

    }

    //set volume
    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel <= 7){
            volumeLevel = newVolumeLevel;
        }

    }

    //naikin channel
    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }

    //turun channel
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }

    //naikin volume
    public void volumeUp(){
        if (on && volumeLevel < 7){
            volumeLevel++;

        }
    }

    //turunin volume
    public void volumeDown(){
        if (on && volumeLevel > 1){
            volumeLevel--;
        }
    }
    
}

