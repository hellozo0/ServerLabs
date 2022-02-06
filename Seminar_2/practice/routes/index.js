const express = require("express");
const router = express.Router();

/* GET home page. */
router.get("/", function (req, res, next) {
  res.render("index", { title: "Express" });
});

router.use("/api", require("./api"));

router.use("/blog", require("./blog"));

module.exports = router;