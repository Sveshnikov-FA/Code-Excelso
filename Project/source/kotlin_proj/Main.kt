import javafx.application.Application
import javafx.scene.*
import javafx.scene.control.Label
import javafx.scene.image.*
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.stage.Stage

class Main: Application() {

    override fun start(stage: Stage) {
        var coffee: MutableList<String> = mutableListOf()
        var wh = 0
        var lab = Label("")
        lab.font = Font.font("Monospaced",32.0)
        lab.translateY = 50.0
        var table = Image(Main::class.java.getResourceAsStream("table.png"))
        var kettle = Image(Main::class.java.getResourceAsStream("kettle.png"))
        var milk = Image(Main::class.java.getResourceAsStream("milk.png"))
        var whisk = Image(Main::class.java.getResourceAsStream("whisk.png"))
        var cpot = Image(Main::class.java.getResourceAsStream("coffeepot.png"))
        var enter = Image(Main::class.java.getResourceAsStream("enter.png"))
        var back = Image(Main::class.java.getResourceAsStream("back.png"))
        var lemon = Image(Main::class.java.getResourceAsStream("lemon.png"))
        var ice = Image(Main::class.java.getResourceAsStream("ice.png"))
        var wc = Image(Main::class.java.getResourceAsStream("whippedcream.png"))
        var lungo = Image(Main::class.java.getResourceAsStream("lungo.png"))
        var ristr = Image(Main::class.java.getResourceAsStream("ristretto.png"))
        var tea = Image(Main::class.java.getResourceAsStream("teapot.png"))
        var espresso = Image(Main::class.java.getResourceAsStream("espresso.png"))
        var doppio = Image(Main::class.java.getResourceAsStream("doppio.png"))
        var romano = Image(Main::class.java.getResourceAsStream("romano.png"))
        var bonbon = Image(Main::class.java.getResourceAsStream("bonbon.png"))
        var lungocup = Image(Main::class.java.getResourceAsStream("lungocup.png"))
        var machiato = Image(Main::class.java.getResourceAsStream("machiato.png"))
        var hielo = Image(Main::class.java.getResourceAsStream("hielo.png"))
        var piccololatte = Image(Main::class.java.getResourceAsStream("ristrettocup.png"))
        var cappuccino = Image(Main::class.java.getResourceAsStream("cappuccino.png"))
        var flatwhite = Image(Main::class.java.getResourceAsStream("flatwhite.png"))
        var chailatte = Image(Main::class.java.getResourceAsStream("chailatte.png"))
        var americano = Image(Main::class.java.getResourceAsStream("americano.png"))
        var longblack = Image(Main::class.java.getResourceAsStream("longblack.png"))
        var latte = Image(Main::class.java.getResourceAsStream("latte.png"))
        var caphesuada = Image(Main::class.java.getResourceAsStream("caphesuada.png"))
        var galao = Image(Main::class.java.getResourceAsStream("galao.png"))
        var frappe = Image(Main::class.java.getResourceAsStream("frappe.png"))
        var vienna = Image(Main::class.java.getResourceAsStream("viennalatte.png"))
        var allmilk = Image(Main::class.java.getResourceAsStream("allmilk.png"))
        var allwater = Image(Main::class.java.getResourceAsStream("allwater.png"))
        var allfoam = Image(Main::class.java.getResourceAsStream("allmilkfoam.png"))

        var tableInit = ImageView(table)
        tableInit.x = 90.0
        tableInit.y = 250.0
        var lungoInit = ImageView(lungo)
        lungoInit.x = 550.0
        lungoInit.y = 219.0
        lungoInit.setOnMouseClicked {
            coffee.add("lungo")
        }
        var kettleInit = ImageView(kettle)
        kettleInit.x = 662.0
        kettleInit.y = 217.0
        kettleInit.setOnMouseClicked {
            coffee.add("water")
        }
        var milkInit = ImageView(milk)
        milkInit.x = 210.0
        milkInit.y = 228.0
        milkInit.setOnMouseClicked {
            if(wh==0) coffee.add("milk")
            else {
                coffee.add("Mfoam")
                wh = 0
            }
        }
        var whiskInit = ImageView(whisk)
        whiskInit.x = 159.0
        whiskInit.y = 205.0
        whiskInit.setOnMouseClicked {
            wh = 1
        }
        var cpotInit = ImageView(cpot)
        cpotInit.x = 477.0
        cpotInit.y = 225.0
        cpotInit.setOnMouseClicked {
            if(wh==0) coffee.add("espresso")
            else {
                coffee.add("Cfoam")
                wh = 0
            }
        }
        var lemonInit = ImageView(lemon)
        lemonInit.x = 300.0
        lemonInit.y = 332.0
        lemonInit.setOnMouseClicked {
            coffee.add("lemon")
        }
        var iceInit = ImageView(ice)
        iceInit.x = 618.0
        iceInit.y = 357.0
        iceInit.setOnMouseClicked {
            coffee.add("ice")
        }
        var ristrInit = ImageView(ristr)
        ristrInit.x = 554.0
        ristrInit.y = 262.5
        ristrInit.setOnMouseClicked {
            coffee.add("ristr")
        }
        var teaInit = ImageView(tea)
        teaInit.x = 695.0
        teaInit.y = 294.0
        teaInit.setOnMouseClicked {
            coffee.add("tea")
        }
        var wcInit = ImageView(wc)
        wcInit.x = 153.0
        wcInit.y = 239.0
        wcInit.setOnMouseClicked {
            coffee.add("wc")
        }
        var espInit = ImageView(espresso)
        espInit.x = 390.0
        espInit.y = 305.0
        var dopInit = ImageView(doppio)
        dopInit.x = 390.0
        dopInit.y = 305.0
        var romInit = ImageView(romano)
        romInit.x = 390.0
        romInit.y = 305.0
        var bbInit = ImageView(bonbon)
        bbInit.x = 390.0
        bbInit.y = 305.0
        var lngInit = ImageView(lungocup)
        lngInit.x = 390.0
        lngInit.y = 305.0
        var mctInit = ImageView(machiato)
        mctInit.x = 390.0
        mctInit.y = 305.0
        var hlInit = ImageView(hielo)
        hlInit.x = 390.0
        hlInit.y = 305.0
        var plInit = ImageView(piccololatte)
        plInit.x = 390.0
        plInit.y = 290.0
        var cpcInit = ImageView(cappuccino)
        cpcInit.x = 390.0
        cpcInit.y = 295.0
        var fwInit = ImageView(flatwhite)
        fwInit.x = 390.0
        fwInit.y = 295.0
        var clInit = ImageView(chailatte)
        clInit.x = 390.0
        clInit.y = 295.0
        var amInit = ImageView(americano)
        amInit.x = 390.0
        amInit.y = 295.0
        var lbInit = ImageView(longblack)
        lbInit.x = 390.0
        lbInit.y = 295.0
        var latteInit = ImageView(latte)
        latteInit.x = 390.0
        latteInit.y = 275.0
        var cpsdInit = ImageView(caphesuada)
        cpsdInit.x = 390.0
        cpsdInit.y = 275.0
        var gloInit = ImageView(galao)
        gloInit.x = 390.0
        gloInit.y = 275.0
        var frpInit = ImageView(frappe)
        frpInit.x = 390.0
        frpInit.y = 275.0
        var vnInit = ImageView(vienna)
        vnInit.x = 390.0
        vnInit.y = 310.0
        var mlkInit = ImageView(allmilk)
        mlkInit.x = 390.0
        mlkInit.y = 310.0
        var wtrInit = ImageView(allwater)
        wtrInit.x = 390.0
        wtrInit.y = 310.0
        var fmInit = ImageView(allfoam)
        fmInit.x = 390.0
        fmInit.y = 310.0
        var backInit = ImageView(back)
        var enterInit = ImageView(enter)
        var root = Group(tableInit,lungoInit,kettleInit,whiskInit,milkInit,ristrInit,cpotInit,enterInit,backInit,wcInit,teaInit,iceInit,lemonInit,lab)
        backInit.x = 10.0
        backInit.y = 10.0
        backInit.setOnMouseClicked {
            coffee.clear()
            if(root.children.last()!=lab) root.children.remove(root.children.last())
            wh = 0
            lab.text = ""
        }
        enterInit.x = 90.0
        enterInit.y = 10.0
        enterInit.setOnMouseClicked {
            if(coffee.size==0) println("")
            else if(coffee.size==1) {
                if(coffee[0]=="water") {
                    root.children.addAll(wtrInit)
                    lab.text = "Water"
                    lab.translateX = 455.0
                }
                else if(coffee[0]=="espresso") {
                    root.children.addAll(espInit)
                    lab.text = "Espresso"
                    lab.translateX = 430.0
                }
                else if(coffee[0]=="milk") {
                    root.children.addAll(mlkInit)
                    lab.text = "Milk"
                    lab.translateX = 455.0
                }
                else if(coffee[0]=="tea") {
                    root.children.addAll(espInit)
                    lab.text = "Tea"
                    lab.translateX = 465.0
                }
            } else if(coffee.size==2) {
                if(coffee[0]=="espresso") {
                    if(coffee[1]=="espresso") {
                        root.children.addAll(espInit)
                        lab.text = "Espresso"
                        lab.translateX = 430.0
                    }
                    else if(coffee[1]=="Mfoam") {
                        root.children.addAll(mctInit)
                        lab.text = "Machiato"
                        lab.translateX = 430.0
                    }
                    else if(coffee[1]=="lemon") {
                        root.children.addAll(romInit)
                        lab.text = "Espresso Romano"
                        lab.translateX = 380.0
                    }
                    else if (coffee[1]=="ice") {
                        root.children.addAll(hlInit)
                        lab.text = "Café con Hielo"
                        lab.translateX = 380.0
                    }
                    else if (coffee[1]=="milk") {
                        root.children.addAll(bbInit)
                        lab.text = "Bon bon"
                        lab.translateX = 430.0
                    }
                } else if(coffee[0]=="lungo" && coffee[1]=="lungo") {
                    root.children.addAll(lngInit)
                    lab.text = "Lungo"
                    lab.translateX = 455.0
                }
                else if(coffee[0]=="milk") {
                    if(coffee[1]=="espresso") {
                        root.children.addAll(bbInit)
                        lab.text = "Bon bon"
                        lab.translateX = 430.0
                    }
                    else if(coffee[1]=="milk") {
                        root.children.addAll(mlkInit)
                        lab.text = "Milk"
                        lab.translateX = 455.0
                    }
                }
            } else if(coffee.size==3) {
                if(coffee[0]=="espresso") {
                    if(coffee[1]=="milk" && coffee[2]=="Mfoam") {
                        root.children.addAll(cpcInit)
                        lab.text = "Cappucino"
                        lab.translateX = 430.0
                    }
                    else if (coffee[1]=="milk" && coffee[2]=="milk") {
                        root.children.addAll(fwInit)
                        lab.text = "Flat White"
                        lab.translateX = 405.0
                    }
                    else if (coffee[1]=="water" && coffee[2]=="water") {
                        root.children.addAll(amInit)
                        lab.text = "Americano"
                        lab.translateX = 430.0
                    }
                    else if (coffee[1]=="espresso" && coffee[2]=="wc") {
                        root.children.addAll(vnInit)
                        lab.text = "Vienna"
                        lab.translateX = 455.0
                    }
                    else if (coffee[1]=="espresso" && coffee[2]=="espresso") {
                        root.children.addAll(espInit)
                        lab.text = "Espresso"
                        lab.translateX = 430.0
                    }
                } else if(coffee[0]=="water") {
                    if(coffee[1]=="water" && coffee[2]=="espresso") {
                        root.children.addAll(lbInit)
                        lab.text = "Long Black"
                        lab.translateX = 405.0
                    }
                    if(coffee[1]=="water" && coffee[2]=="water") {
                        root.children.addAll(wtrInit)
                        lab.text = "Water"
                        lab.translateX = 455.0
                    }
                } else if(coffee[0]=="tea") {
                    if(coffee[1]=="milk" && coffee[2]=="Mfoam") {
                        root.children.addAll(clInit)
                        lab.text = "Chai Latte"
                        lab.translateX = 405.0
                    }
                    else if(coffee[1]=="tea" && coffee[2]=="tea") {
                        root.children.addAll(clInit)
                        lab.text = "Tea"
                        lab.translateX = 465.0
                    }
                } else if(coffee[0]=="ristretto" && coffee[1]=="milk" && coffee[2]=="Mfoam") {
                    root.children.addAll(plInit)
                    lab.text = "Piccolo Latte"
                    lab.translateX = 380.0
                }
            } else if(coffee.size>3) {
                if (coffee[0] == "espresso" && coffee[1] == "milk" && coffee[2] == "milk" && coffee[3] == "milk") {
                    if (coffee.size == 5) {
                        if (coffee[4] == "Mfoam") {
                            root.children.addAll(latteInit)
                            lab.text = "Latte"
                            lab.translateX = 455.0
                        }
                    } else {
                        root.children.addAll(gloInit)
                        lab.text = "Galão"
                        lab.translateX = 455.0
                    }
                }else if(coffee.size==5 && (coffee[0] == "milk" && coffee[1] == "espresso" && coffee[2] == "espresso" && coffee[3] == "espresso" && coffee[4] == "ice")) {
                    root.children.addAll(cpsdInit)
                    lab.text = "Ca Phe Sua Da"
                    lab.translateX = 355.0
                }
                else if(coffee.size==6 && (coffee[0]=="espresso" && coffee[1]=="water" && coffee[2]=="water" && coffee[3]=="water" && coffee[4]=="ice" && coffee[5]=="Cfoam")) {
                    root.children.addAll(frpInit)
                    lab.text = "Frappé"
                    lab.translateX = 455.0
                }
            }
        }
        var scene: Scene = Scene(root, 955.0,700.0, Color.WHITE)
        scene.root = root
        stage.scene = scene
        stage.title = "coffee game v2"
        stage.isResizable = false
        stage.show()
    }
}
fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}