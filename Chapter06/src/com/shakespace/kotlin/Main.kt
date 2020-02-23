package com.shakespace.kotlin


fun main(args: Array<String>) {

    html {
        "id"("HtmlId")
//        children.add(Tag("head"))
        "head"{
            "id"("HeadId")
        }
        "body"{
            "a"{
                "href"("http://www.baidu.com")
                + "kotlin "
            }
        }

    }
            .render().let(::println)


    /**
     *  有点类似 gradle
     */
//    html {
//        propertyies["id"] = "HtmlID"
//        children.add(Tag("head"))
//    }
//            .render().let(::println)

//    Tag("html").apply {
//        propertyies["id"] = "HtmlID"
//        children.add(Tag("head"))
//    }
//            .render().let(::println)

}