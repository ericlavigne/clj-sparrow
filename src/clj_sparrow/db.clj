(ns clj-sparrow.db
  (:require [fleetdb.embedded :as fdb]))

(defn create
  "Create a new database, persisted or in-memory,
   depending on whether file-name provided."
  ([file-name]
     (fdb/load-persistent (str file-name ".fdb")))
  ([]
     (fdb/init-ephemeral)))

(defn query [db the-query]
  (fdb/query db the-query))
