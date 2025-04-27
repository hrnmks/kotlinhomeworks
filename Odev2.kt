package com.example.kotlinderslerii.nesne_tabanli_programlama

class Odev2 {
    fun soru1( celcius : Double) : Double{

        return celcius*1.8+32
    }
    fun soru2(height :Int, Width : Int ){
        println(height*Width)
    }
    fun soru3( fact :Int):Int{
        var i =1
       while (i<fact){
           i*=i
       }
        return i
    }
    fun soru4(girdi : String ):Int {
        var sayac=0
        for (harf in girdi){
      if (harf == 'a'){
          sayac++
      }
        }
   return sayac  }
   fun soru4(kenarsayisi : Int):Int{
       return(kenarsayisi-2)*180
   }
    fun soru5(gunsayisi:Int):Int{
        var sayac=0
       if (gunsayisi<20){
         sayac=gunsayisi*80
       }else{
           sayac= (20*80)+(gunsayisi-20)*160
       }
    return sayac}

    fun soru6(kotamiktari:Int):Int{
        var a=0
        if(kotamiktari>50){
            a = 100+((kotamiktari-50)*4)
        }
    return a }
}