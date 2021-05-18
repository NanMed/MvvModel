package edu.itesm.mvvmodeldemo.model

class MensajesProvider {
    companion object{
        fun randomMensaje(): MensajeModel{
            val posicion = (0..mensajes.size-1).random()
            return mensajes[posicion]
        }
        private val mensajes = listOf<MensajeModel>(
            MensajeModel(mensaje = "Frankly, my dear, I don’t give a damn.", "frankly_1"),
            MensajeModel(mensaje = "May the Force be with you.", "force_02"),
            MensajeModel(mensaje = "You talking to me?", "talk_03"),
            MensajeModel(mensaje = "E.T. phone home.", "et_04"),
            MensajeModel(mensaje = "Bond. James Bond.", "bond_05"),
            MensajeModel(mensaje = "Show me the money!", "money_06"),
            MensajeModel(mensaje = "You can't handle the truth!", "truth_07"),
            MensajeModel(mensaje = "Mama always said life was like a box of\n" +
                    "chocolates. You never know what you're\n" +
                    "gonna get", "mama_08"),
            MensajeModel(mensaje = "Keep your friends close, but your enemies\n" +
                    "closer.", "friends_09"),
            MensajeModel(mensaje = "I´m Batman", "batman_10"),
            MensajeModel(mensaje = "Why So Serious???", "why_011")
        )
    }
}