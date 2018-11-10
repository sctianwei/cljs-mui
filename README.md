# CLJS-MUI

A ClojureScript Material-UI wrapper. 

`Material-UI v3.2.0`

[![Clojars Project](https://img.shields.io/clojars/v/id.nadiar/cljs-mui.svg)](https://clojars.org/id.nadiar/cljs-mui)


#### Leiningen/Boot
```
[id.nadiar/cljs-mui "0.1.0-alpha2"]
```
#### Clojure CLI/deps.edn
```
id.nadiar/cljs-mui {:mvn/version "0.1.0-alpha2"}
```

## Usage

In progress library. Pull request are welcomed.

```Clojure
(:require [id.nadiar.cljs-mui.core :as mui] 
          [id.nadiar.cljs-mui.icons :as icon] 
          [id.nadiar.cljs-mui.style :as style])
```

Example (reagent)

```Clojure
(defn custom-styles [theme]
 (clj->js
   {:button {:margin (.. theme -spacing -unit)}
    :textField {:marginLeft (.. theme -spacing -unit)
                :marginRight (.. theme -spacing -unit)}}))
                
(def with-my-styles (style/with-styles custom-styles))                
                
(defn my-button [{:keys [classes] :as props}]
  [mui/Button {:variant "contained"
               :color "primary"
               :className (.-button classes)}
   "Hello World!"
   [icon/ZoomOutTwoTone]])
                
(defn hello-world []
  [:div
   [:> (with-my-styles (reagent.core/reactify-component my-button))]])                
```

## License

Copyright © 2018

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
