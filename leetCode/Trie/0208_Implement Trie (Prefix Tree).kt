package leetCode.Trie

import jdk.internal.icu.impl.Trie

class ImplementTrie {
    val root = Array<Trie?>(26) { null }
    fun Char.ind() = toInt() - 'a'.toInt()
    operator fun get(c: Char): Trie? = root[c.ind()]
    operator fun set(c: Char, v: Trie) { root[c.ind()] = v }
    var isWord = false

    fun insert(word: String) {
        var t = this
        word.forEach { t = t[it] ?: Trie().apply { t[it] = this} }
        t.isWord = true
    }

    fun String.search(): Trie? {
        var t = this@Trie
        forEach { t = t[it] ?: return@search null }
        return t
    }

    fun search(word: String) = word.search()?.isWord ?: false

    fun startsWith(prefix: String) = prefix.search() != null

}


var obj = Trie()
obj.insert(word)
var param_2 = obj.search(word)
var param_3 = obj.startsWith(prefix)
