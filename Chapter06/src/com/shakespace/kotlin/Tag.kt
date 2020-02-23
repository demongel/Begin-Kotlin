package com.shakespace.kotlin

open class Tag(val name: String) : Node {

    val children = ArrayList<Node>()
    val propertyies = HashMap<String, String>()

    operator fun String.invoke(value: String) {
        propertyies[this] = value
    }

    operator fun String.invoke(block: Tag.() -> Unit) {
        children.add(Tag(this).apply(block))
    }

    operator  fun String.unaryPlus(){
        children.add(StringNode(this))
    }


    override fun render(): String {
        return StringBuilder()
                .append("<")
                .append(name)
                .let { stringBuilder ->
                    if (!this.propertyies.isEmpty()) {
                        stringBuilder.append(" ")
                        this.propertyies.forEach {
                            stringBuilder.append(it.key)
                                    .append("=")
                                    .append(it.value)
                        }
                    }
                    stringBuilder
                }
                .append(">")
                .let { stringBuilder ->
                    // j将children转成字符串
                    children.map(Node::render)
                            .map(stringBuilder::append)
                    stringBuilder
                }
                .append("</$name>")


                .toString()
    }

}