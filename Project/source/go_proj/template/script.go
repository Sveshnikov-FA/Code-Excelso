package main
import (
	. "github.com/siongui/godom"
	"strconv"
	"github.com/gopherjs/gopherjs/js"
	"time"
	)
func main() {

		var iw, ih= js.Global.Get("innerWidth").Int(), js.Global.Get("innerHeight").Int()
		var left, top= iw/2, ih/2

		ball := Document.QuerySelector("#ball")
		f := Document.QuerySelector("#block")
		g := Document.QuerySelector("#block_r")
		scA := Document.QuerySelector("#score")
		scB := Document.QuerySelector("#score_r")
		scoreA := scA.Get("innerHTML").Int()
		scoreB := scB.Get("innerHTML").Int()
		dir := 1
		dirY := 1
		var iter= false
		go func() {
			for true {
				iw = js.Global.Get("innerWidth").Int()
				ih = js.Global.Get("innerHeight").Int()
				topA := f.Get("style").Get("top").Int()
				topB := g.Get("style").Get("top").Int()
				if iter {
					left = ball.Get("style").Get("left").Int()
					top = ball.Get("style").Get("top").Int()
				}
				if left > iw-23 || left < 0 || (left <= 32 && top >= topA-5 && top <= topA+125) || (left >= iw-45 && top >= topB-10 && top <= topB+125) {
					if left <= 0 {
						scoreB = scoreB + 1
						scB.SetInnerHTML(strconv.Itoa(scoreB))
					} else if left >= iw-23 {
						scoreA = scoreA + 1
						scA.SetInnerHTML(strconv.Itoa(scoreA))
					}
					dir = dir * -1
				}
				if (top > ih-23 || top < 0) {
					dirY = dirY * -1
				}
				ball.Get("style").Set("left", strconv.Itoa(left+dir))
				ball.Get("style").Set("top", strconv.Itoa(top+dirY))
				iter = true
				time.Sleep(time.Nanosecond)
			}
		}()
		Document.AddEventListener("keydown", func(e Event) {
			var tp= f.Get("style").Get("top").Int()
			var tp1= g.Get("style").Get("top").Int()
			if e.KeyCode() == 38 && tp > -5 {
				f.Get("style").Set("top", (strconv.Itoa(tp-10) + "px"))
			}
			if e.KeyCode() == 40 && tp < (ih-125) {
				f.Get("style").Set("top", (strconv.Itoa(tp+10) + "px"))
			}
			if e.KeyCode() == 87 && tp1 > -5 {
				g.Get("style").Set("top", (strconv.Itoa(tp1-10) + "px"))
			}
			if e.KeyCode() == 83 && tp1 < (ih-125) { 
				g.Get("style").Set("top", (strconv.Itoa(tp1+10) + "px"))
			}
		})
}
