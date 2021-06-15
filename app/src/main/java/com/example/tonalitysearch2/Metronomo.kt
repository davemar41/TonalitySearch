package com.example.tonalitysearch2

import android.content.Intent
import android.media.AudioManager
import android.media.ToneGenerator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tonalitysearch2.databinding.ActivityMetronomoBinding
import java.util.*
import kotlin.concurrent.thread
import kotlin.concurrent.timerTask

class Metronomo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind4=ActivityMetronomoBinding.inflate(layoutInflater)
        setContentView(bind4.root)
        bind4.editbeat.setText("100")
        var BPM:Long=bind4.editbeat.text.toString().toLong()
        var BPMactual:Long=0

        var estado:Boolean=false
        var milisegundos:Long=0
        val segundosporminuto:Long=60
        lateinit var metronomo: Timer
        val tono= ToneGenerator.TONE_PROP_BEEP2




        fun Crearsonido(){
            if(!estado){
                metronomo= Timer("metronomo",true)
            }
        }
        fun arribatempo():Long{
           var BPM:Long=bind4.editbeat.text.toString().toLong()
           BPM++
            BPMactual=BPM
            bind4.editbeat.setText(BPM.toString())
            return BPM
        }
        fun abajotempo(BPM:Long):Long{
            var BPM:Long=bind4.editbeat.text.toString().toLong()
            BPM--
            BPMactual=BPM
            bind4.editbeat.setText(BPM.toString())
            return BPM


        }


        fun calculotempo(): Long {
                BPM=bind4.editbeat.text.toString().toLong()

                milisegundos = (1000 * (segundosporminuto /BPM.toDouble())).toLong()
                return milisegundos








        }
        fun start(BPM:Long):Boolean {

                metronomo.schedule(
                        timerTask {
                            val toneGenerator = ToneGenerator(AudioManager.STREAM_MUSIC, 100)
                            toneGenerator.startTone(tono)
                            toneGenerator.release()
                            /*if(bind4.mas.isPressed||bind4.menos.isPressed){
                                toneGenerator.stopTone()


                            }*/



                        },0L,
                        calculotempo()



                )
            return true

        }

        fun stop():Boolean{
            metronomo.cancel()

            bind4.play.isEnabled=true
            //Crearsonido()
            return true
        }
        fun reseteo(BPM:Long):Boolean{
            //metronomo.cancel()
            metronomo.schedule(
                    timerTask {
                        val toneGenerator = ToneGenerator(AudioManager.STREAM_MUSIC, 100)
                        toneGenerator.startTone(tono)
                        toneGenerator.release()
                        /*if(bind4.mas.isPressed||bind4.menos.isPressed){
                            toneGenerator.stopTone()


                        }*/



                    },0L,
                    calculotempo()



            )

            return true
        }



        bind4.mas.setOnClickListener {
            arribatempo()
        }
        bind4.menos.setOnClickListener {

                abajotempo(BPM)
        }
        bind4.play.setOnClickListener {
            Crearsonido()
            start(BPM)

            estado=true

            bind4.play.isEnabled=false

        }
        bind4.reset2.setOnClickListener {

            stop()
            Toast.makeText(this,"actualizando tempo",Toast.LENGTH_LONG).show()

            Crearsonido()
            start(BPM)
            //start(BPM)
            //estado=true
            bind4.play.isEnabled=true

        }
        bind4.stop.setOnClickListener {
            stop()
            estado=false
            //bind4.play.isEnabled=true
        }
        bind4.volver3.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }



    }
}