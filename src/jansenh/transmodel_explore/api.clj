(ns jansenh.transmodel-explore.api
  (:require [jansenh.transmodel.parser.utilities :refer [parse-datetime]]))


(def tzt
  "Circuit breaker"
  (parse-datetime "2025-01-15T14:30:00"))

(comment
  (println tzt)
  )
