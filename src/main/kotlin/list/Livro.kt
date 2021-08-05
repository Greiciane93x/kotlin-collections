package list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacacao: Long,
    val editora: String? = null


): Comparable<Livro> {
    /**
     * Compares this object with the specified object for order. Returns zero if this object is equal
     * to the specified [other] object, a negative number if it's less than [other], or a positive number
     * if it's greater than [other].
     */
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacacao.compareTo(other.anoPublicacacao)
    }
}
