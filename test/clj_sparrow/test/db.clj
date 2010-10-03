(ns clj-sparrow.test.db
  (:use [clj-sparrow.db] :reload)
  (:use [clojure.test]))

(deftest insert-test
  (let [db (create)
        birds [{"id" 1 "name" "bluebird"}
               {"id" 2 "name" "mockingbird"}]]
    (query db ["insert" "birds" birds])
    (is (= (set birds)
           (set (query db ["select" "birds"]))))))

