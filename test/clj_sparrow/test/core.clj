(ns clj-sparrow.test.core
  (:use [clj-sparrow.core] :reload)
  (:use [clojure.test]))

(deftest arithmetic-test
  (is (= (+ 1 1) 2)
      "1 + 1 = 2"))
