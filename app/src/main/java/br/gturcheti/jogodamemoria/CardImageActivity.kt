package br.gturcheti.jogodamemoria

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.gturcheti.jogodamemoria.databinding.ActivityCardImageBinding

class CardImageActivity : AppCompatActivity() {

    val card1 = Cartao()
    val card2 = Cartao()
    val card3 = Cartao()
    val card4 = Cartao()
    val card5 = Cartao()
    val card6 = Cartao()
    val card7 = Cartao()
    val card8 = Cartao()
    val card9 = Cartao()
    val card10 = Cartao()
    val card11 = Cartao()
    val card12 = Cartao()
    val card13 = Cartao()
    val card14 = Cartao()
    val card15 = Cartao()
    val card16 = Cartao()
    val card17 = Cartao()
    val card18 = Cartao()
    val card19 = Cartao()
    val card20 = Cartao()

    val binding by lazy {
        ActivityCardImageBinding.inflate(layoutInflater)
    }

    private var contadorClick: Int = 0
    private var hashPrimeiroCartao: Int? = null
    private var hashSegundoCartao: Int? = null
    private var naoRevelados = mutableListOf<Cartao>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        inicializaCartoes()
        carregaFigurinhas()
    }


    fun dialogoParabens() {
        AlertDialog.Builder(this)
            .setTitle("PARABÉNS")
            .setMessage("Você acertou todos os pares!")
            .setPositiveButton("Recomeçar") { dialogInterface, i -> recomecarJogo() }
            .show()
    }

    fun recomecarJogo() {
        inicializaCartoes()
        carregaFigurinhas()
        naoRevelados.forEach { it.back!!.bringToFront() }
        contadorClick = 0
    }

    fun resetaCartoes() {
        contadorClick = 0
        naoRevelados.forEach { it.back!!.bringToFront() }
    }

    fun clickFront(imageview: ImageView) {
        when (contadorClick) {
            in 0..1 -> Toast.makeText(this, "Não Permitido", Toast.LENGTH_SHORT).show()
            else -> {
                this.contadorClick = 0
                imageview.bringToFront()
                resetaCartoes()
            }
        }

    }

    fun clickBack(imageview: ImageView) {
        if (contadorClick == 0)
            return funcaoViraPrimeiroCartao(imageview)
        if (contadorClick == 1)
            return funcaoViraSegundoCartao(imageview)
    }

    fun funcaoViraPrimeiroCartao(item: ImageView) {
        item.bringToFront()
        this.hashPrimeiroCartao = item.getTag() as Int?
        Log.i("Hash Card", "$hashPrimeiroCartao")
        this.contadorClick++
    }

    fun funcaoViraSegundoCartao(item: ImageView) {
        item.bringToFront()
        this.hashSegundoCartao = item.getTag() as Int?
        Log.i("Hash Card", "$hashSegundoCartao")
        if (hashPrimeiroCartao == hashSegundoCartao) {
            val remove1 = naoRevelados.filter { it.front!!.tag == hashPrimeiroCartao }
            val remove2 = naoRevelados.filter { it.front!!.tag == hashSegundoCartao }
            val removidas = remove1 + remove2
            Log.i("Removidas", "$removidas")
            this.naoRevelados.removeAll(removidas)
            Log.i("Falta revelar:", "$naoRevelados")
            Log.i("Lista está vazia?", "${naoRevelados.isEmpty()}")
            if (naoRevelados.isEmpty())
                dialogoParabens()
            this.contadorClick = 0 // zera contador de cliques
        } else {
            contadorClick++
        }
    }

    fun carregaFigurinhas() {
        val lista = criaFigurinhas()

        binding.figurinhaCard1.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard2.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard3.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard4.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard5.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard6.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard7.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard8.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard9.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard10.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard11.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard12.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard13.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard14.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard15.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard16.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard17.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard18.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard19.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
        binding.figurinhaCard20.run {
            val item = lista.random()
            setImageResource(item)
            this.setTag(item)
            lista.remove(item)
        }
    }

    fun criaFigurinhas(): MutableList<Int> {
        val alfaRomeo = R.drawable.alfaromeo
        val alphaTauri = R.drawable.alphatauri
        val alpine = R.drawable.alpine
        val astonMartin = R.drawable.astonmartin
        val ferrari = R.drawable.ferrari
        val haas = R.drawable.haas
        val mclaren = R.drawable.mclaren
        val mercedes = R.drawable.mercedes
        val redbull = R.drawable.redbull
        val williams = R.drawable.williams


        return mutableListOf(
            alfaRomeo,
            alphaTauri,
            alpine,
            astonMartin,
            ferrari,
            haas,
            mclaren,
            mercedes,
            redbull,
            williams,
            alfaRomeo,
            alphaTauri,
            alpine,
            astonMartin,
            ferrari,
            haas,
            mclaren,
            mercedes,
            redbull,
            williams,
        )

    }

    fun inicializaCartoes() {
        inicializaCard1()
        inicializaCard2()
        inicializaCard3()
        inicializaCard4()
        inicializaCard5()
        inicializaCard6()
        inicializaCard7()
        inicializaCard8()
        inicializaCard9()
        inicializaCard10()
        inicializaCard11()
        inicializaCard12()
        inicializaCard13()
        inicializaCard14()
        inicializaCard15()
        inicializaCard16()
        inicializaCard17()
        inicializaCard18()
        inicializaCard19()
        inicializaCard20()
    }

    fun inicializaCard1() {
        card1.back = binding.backcardCard1
        card1.front = binding.figurinhaCard1
        naoRevelados.add(card1)
        binding.backcardCard1.setOnClickListener {
            clickBack(binding.figurinhaCard1)
        }
        binding.figurinhaCard1.setOnClickListener {
            clickFront(binding.backcardCard1)
        }
    }

    fun inicializaCard2() {
        card2.back = binding.backcardCard2
        card2.front = binding.figurinhaCard2
        naoRevelados.add(card2)
        binding.backcardCard2.setOnClickListener {
            clickBack(binding.figurinhaCard2)
        }
        binding.figurinhaCard2.setOnClickListener {
            clickFront(binding.backcardCard2)
        }
    }

    fun inicializaCard3() {
        card3.back = binding.backcardCard3
        card3.front = binding.figurinhaCard3
        naoRevelados.add(card3)
        binding.backcardCard3.setOnClickListener {
            clickBack(binding.figurinhaCard3)
        }
        binding.figurinhaCard3.setOnClickListener {
            clickFront(binding.backcardCard3)
        }
    }

    fun inicializaCard4() {
        card4.back = binding.backcardCard4
        card4.front = binding.figurinhaCard4
        naoRevelados.add(card4)
        binding.backcardCard4.setOnClickListener {
            clickBack(binding.figurinhaCard4)
        }
        binding.figurinhaCard4.setOnClickListener {
            clickFront(binding.backcardCard4)
        }
    }

    fun inicializaCard5() {
        card5.back = binding.backcardCard5
        card5.front = binding.figurinhaCard5
        naoRevelados.add(card5)
        binding.backcardCard5.setOnClickListener {
            clickBack(binding.figurinhaCard5)
        }
        binding.figurinhaCard5.setOnClickListener {
            clickFront(binding.backcardCard5)
        }
    }

    fun inicializaCard6() {
        card6.back = binding.backcardCard6
        card6.front = binding.figurinhaCard6
        naoRevelados.add(card6)
        binding.backcardCard6.setOnClickListener {
            clickBack(binding.figurinhaCard6)
        }
        binding.figurinhaCard6.setOnClickListener {
            clickFront(binding.backcardCard6)
        }
    }

    fun inicializaCard7() {
        card7.back = binding.backcardCard7
        card7.front = binding.figurinhaCard7
        naoRevelados.add(card7)
        binding.backcardCard7.setOnClickListener {
            clickBack(binding.figurinhaCard7)
        }
        binding.figurinhaCard7.setOnClickListener {
            clickFront(binding.backcardCard7)
        }
    }

    fun inicializaCard8() {
        card8.back = binding.backcardCard8
        card8.front = binding.figurinhaCard8
        naoRevelados.add(card8)
        binding.backcardCard8.setOnClickListener {
            clickBack(binding.figurinhaCard8)
        }
        binding.figurinhaCard8.setOnClickListener {
            clickFront(binding.backcardCard8)
        }
    }

    fun inicializaCard9() {
        card9.back = binding.backcardCard9
        card9.front = binding.figurinhaCard9
        naoRevelados.add(card9)
        binding.backcardCard9.setOnClickListener {
            clickBack(binding.figurinhaCard9)
        }
        binding.figurinhaCard9.setOnClickListener {
            clickFront(binding.backcardCard9)
        }
    }

    fun inicializaCard10() {
        card10.back = binding.backcardCard10
        card10.front = binding.figurinhaCard10
        naoRevelados.add(card10)
        binding.backcardCard10.setOnClickListener {
            clickBack(binding.figurinhaCard10)
        }
        binding.figurinhaCard10.setOnClickListener {
            clickFront(binding.backcardCard10)
        }
    }

    fun inicializaCard11() {
        card11.back = binding.backcardCard11
        card11.front = binding.figurinhaCard11
        naoRevelados.add(card11)
        binding.backcardCard11.setOnClickListener {
            clickBack(binding.figurinhaCard11)
        }
        binding.figurinhaCard11.setOnClickListener {
            clickFront(binding.backcardCard11)
        }
    }

    fun inicializaCard12() {
        card12.back = binding.backcardCard12
        card12.front = binding.figurinhaCard12
        naoRevelados.add(card12)
        binding.backcardCard12.setOnClickListener {
            clickBack(binding.figurinhaCard12)
        }
        binding.figurinhaCard12.setOnClickListener {
            clickFront(binding.backcardCard12)
        }
    }

    fun inicializaCard13() {
        card13.back = binding.backcardCard13
        card13.front = binding.figurinhaCard13
        naoRevelados.add(card13)
        binding.backcardCard13.setOnClickListener {
            clickBack(binding.figurinhaCard13)
        }
        binding.figurinhaCard13.setOnClickListener {
            clickFront(binding.backcardCard13)
        }
    }

    fun inicializaCard14() {
        card14.back = binding.backcardCard14
        card14.front = binding.figurinhaCard14
        naoRevelados.add(card14)
        binding.backcardCard14.setOnClickListener {
            clickBack(binding.figurinhaCard14)
        }
        binding.figurinhaCard14.setOnClickListener {
            clickFront(binding.backcardCard14)
        }
    }

    fun inicializaCard15() {
        card15.back = binding.backcardCard15
        card15.front = binding.figurinhaCard15
        naoRevelados.add(card15)
        binding.backcardCard15.setOnClickListener {
            clickBack(binding.figurinhaCard15)
        }
        binding.figurinhaCard15.setOnClickListener {
            clickFront(binding.backcardCard15)
        }
    }

    fun inicializaCard16() {
        card16.back = binding.backcardCard16
        card16.front = binding.figurinhaCard16
        naoRevelados.add(card16)
        binding.backcardCard16.setOnClickListener {
            clickBack(binding.figurinhaCard16)
        }
        binding.figurinhaCard16.setOnClickListener {
            clickFront(binding.backcardCard16)
        }
    }

    fun inicializaCard17() {
        card17.back = binding.backcardCard17
        card17.front = binding.figurinhaCard17
        naoRevelados.add(card17)
        binding.backcardCard17.setOnClickListener {
            clickBack(binding.figurinhaCard17)
        }
        binding.figurinhaCard17.setOnClickListener {
            clickFront(binding.backcardCard17)
        }
    }

    fun inicializaCard18() {
        card18.back = binding.backcardCard18
        card18.front = binding.figurinhaCard18
        naoRevelados.add(card18)
        binding.backcardCard18.setOnClickListener {
            clickBack(binding.figurinhaCard18)
        }
        binding.figurinhaCard18.setOnClickListener {
            clickFront(binding.backcardCard18)
        }
    }

    fun inicializaCard19() {
        card19.back = binding.backcardCard19
        card19.front = binding.figurinhaCard19
        naoRevelados.add(card19)
        binding.backcardCard19.setOnClickListener {
            clickBack(binding.figurinhaCard19)
        }
        binding.figurinhaCard19.setOnClickListener {
            clickFront(binding.backcardCard19)
        }
    }

    fun inicializaCard20() {
        card20.back = binding.backcardCard20
        card20.front = binding.figurinhaCard20
        naoRevelados.add(card20)
        binding.backcardCard20.setOnClickListener {
            clickBack(binding.figurinhaCard20)
        }
        binding.figurinhaCard20.setOnClickListener {
            clickFront(binding.backcardCard20)
        }
    }

}

