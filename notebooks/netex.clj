(ns notebooks.netex
  (:require [scicloj.clay.v2.main]
            [jansenh.transmodel-explore.api :as api]
            #_[scicloj.kindly.v4.kind :as kind]
            #_[tablecloth.api :as tc]
            #_[clojure.string :as str]
            #_[scicloj.clay.v2.api :as clay]
            #_[scicloj.tableplot.v1.plotly :as plotly]
            #_[tech.v3.datatype.datetime :as datetime]))


;;  NeTEx explore notebook
;;  ======================
;;
;;    Notebook for NeTEx dataset exploration.
;;
;;    The implementation is based on Clojure with Noj, Clay, TableCloth et al.
;;    Visualization tools in use are from the JavaScript sphere of tooling.
;;
;;    The api refered in the :require section is a wrapper of a NeTEx parsing
;;    library https://github.com/Henningzen/clj-transmodel
;;
;;    The library is available under EPL 2.0 License but not yet made public.
;;
;; -----------------------------------------------------------------------------
;;  Henning Jansen 2025  Copyright © henning.jansen@jansenh.no  
;;  Distributed under the Eclipse Public License version 2.0 as
;;  described in the README file under the root of this project.


(println api/tzt)
(println "yikes")



































(comment
  "Clay specifics
   --------------
   - rendering and behaviour"
  (clay/make! {:format [:html]
               :source-path "notebooks/netex.clj"
               :title "NeETx Transmodel"
               :browse true
               :show true
               :live-reload true
               :hide-ui-header false
               :hide-info-line true
               :hide-code true})
  ;;------------------------------------------------------------------>  comment
  ;;
  )


