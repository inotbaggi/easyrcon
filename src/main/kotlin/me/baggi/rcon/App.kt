package me.baggi.rcon

import net.kronos.rkon.core.Rcon
import kotlin.system.exitProcess

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val address = args[0]
            val port = args[1].toIntOrNull() ?: run {
                println("Port not number!")
                exitProcess(-1)
            }
            val password = args[2]
            val command = args.takeLast(args.size - 3).joinToString(" ")

            val rcon = Rcon(address, port, password.toByteArray())
            rcon.command(command)
        }
    }
}