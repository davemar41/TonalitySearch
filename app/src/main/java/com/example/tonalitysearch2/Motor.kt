package com.example.tonalitysearch2

class Motor constructor(misacordes:ArrayList<String>) {
    var misacordes = arrayListOf<String>()

    init {
        this.misacordes = misacordes


    }
    fun Calculando(misacordes: ArrayList<String>): Int {
        val domayor = arrayListOf("do mayor", "do mayor7", "do5", "re menor", "re menor7", "re5", "mi menor", "mi menor7", "mi5",
                "fa mayor", "fa mayor7", "fa5", "sol mayor", "sol7", "sol5", "la menor", "la menor7", "la5", "si menor", "si menor7b5","si5")//correcta
        val solmayor = arrayListOf("sol mayor", "sol mayor7", "sol5", "la menor", "la menor7", "la5", "si menor", "si menor7", "si5",
                "do mayor", "do mayor7", "do5", "re mayor", "re7", "re5", "mi menor", "mi menor7", "mi5", "fa# menor", "fa# menor7b5","fa#5")// correcta
        val remayor = arrayListOf("re mayor", "re mayor7", "re5", "mi menor", "mi menor7", "mi5", "fa# menor", "fa# menor7", "fa#5",
                "sol mayor", "sol mayor7", "sol5", "la mayor", "la7", "la5", "si menor", "si menor7", "si5", "do# menor", "do# menor7b5","do#5")//correcta
        val lamayor = arrayListOf("la mayor", "la mayor7", "la5", "si menor", "si menor7", "si5", "do# menor", "do# menor7", "do#5",
                "re mayor", "re mayor7", "re5", "mi mayor", "mi7", "mi5", "fa# menor", "fa# menor7", "fa#5", "sol# menor", "sol# menor7b5","sol#5")//correcto
        val mimayor = arrayListOf("mi mayor", "mi mayor7", "mi5", "fa# menor", "fa# menor7", "fa#5", "sol# menor", "sol# menor7", "sol#5",
                "la mayor", "la mayor7", "la5", "si mayor", "si7", "si5", "do# menor", "do# menor7", "do#5", "re# menor", "re# menor7b5","re#5")
        val simayor = arrayListOf("si mayor", "si mayor7", "si5", "do# menor", "do# menor7", "do#5", "re# menor", "re# menor7", "re#5",
                "mi mayor", "mi mayor7", "mi5", "fa# mayor", "fa#7", "fa#5", "sol# menor", "sol# menor7", "sol#5", "la# menor", "la# menor7b5","la#5")//por revisar
        val famayor = arrayListOf("fa mayor", "fa mayor7", "fa5", "sol menor", "sol menor7", "sol5", "la menor", "la menor7", "la5",
                "sib mayor", "sib mayor7", "sib5", "do mayor", "do7", "do5", "re menor", "re menor7", "re5", "mi menor", "mi menor7b5","mi5")//por revisar
        val sibmayor = arrayListOf("sib mayor", "sib mayor7", "sib5","la# mayor", "la# mayor7", "la#5","do menor", "do menor7", "do5", "re menor", "re menor7", "re5",
                "mib mayor", "mib mayor7", "mib5","re# mayor","re# mayor7","re#5", "fa mayor", "fa7", "fa5", "sol menor", "sol menor7", "sol5", "la menor", "la menor7b5","la5")
        val mibmayor = arrayListOf("mib mayor", "mib mayor7", "mib5","re# mayor","re# mayor7","re#5", "fa menor", "fa menor7", "fa5", "sol menor", "sol menor7", "sol5",
                "lab mayor", "lab mayor7", "lab5", "sib mayor", "sib7", "sib5","la# mayor", "la# mayor7", "la#5", "do menor", "do menor7", "do5", "re menor", "re menor7b5","re5")//por revisar
        val labmayor = arrayListOf("lab mayor", "lab mayor7", "lab5","sol# mayor","sol# mayor7","sol#5", "sib menor", "sib menor7", "sib5","la# mayor", "la# mayor7", "la#5", "do menor", "do menor7", "do5",
                "reb mayor", "reb mayor7", "reb5","do# mayor", "do# mayor7", "do#5", "mib mayor", "mib7", "mib5","re# mayor", "re# mayor7", "re#5", "fa menor", "fa menor7", "fa5", "sol menor", "sol menor7b5","sol5")
        when {
            domayor.containsAll(misacordes) -> {
                return 1
            }
            solmayor.containsAll(misacordes) -> {
                return 2
            }
            remayor.containsAll(misacordes) -> {
                return 3
            }
            lamayor.containsAll(misacordes) -> {
                return 4
            }
            mimayor.containsAll(misacordes) -> {
                return 5
            }
            simayor.containsAll(misacordes) -> {
                return 6
            }
            famayor.containsAll(misacordes) -> {
                return 7
            }
            sibmayor.containsAll(misacordes) -> {
                return 8
            }
            mibmayor.containsAll(misacordes) ->{
                return 9
            }
            labmayor.containsAll(misacordes) ->{
                return 10
            }
            else -> {
                return 0
            }
        }


    }





}