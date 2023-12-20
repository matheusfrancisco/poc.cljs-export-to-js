(ns cljs-poc.core)

(defn ^:export print-string [x]
  (print x))

(defn ^:export hello [a]
  (str "Hello, " a "!"))
