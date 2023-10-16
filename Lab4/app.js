const express = require('express')
const app = express()
const port = 3000


app.get('/soma/:valor1/:valor2', (req, res) => {
    sum = parseInt(req.params.valor1) + parseInt(req.params.valor2)
    res.send(req.params.valor1 + ' + ' +
        req.params.valor2 + ' = ' + sum)
})

app.get('/sub/:valor1/:valor2', (req, res) => {
    sub = parseInt(req.params.valor1) - parseInt(req.params.valor2)
    res.send(req.params.valor1 + ' - ' +
        req.params.valor2 + ' = ' + sub)
})

app.get('/mult/:valor1/:valor2', (req, res) => {
    mult = parseInt(req.params.valor1) * parseInt(req.params.valor2)
    res.send(req.params.valor1 + ' * ' +
        req.params.valor2 + ' = ' + mult)
})

app.get('/div/:valor1/:valor2', (req, res) => {
    div = parseInt(req.params.valor1) / parseInt(req.params.valor2)
    res.send(req.params.valor1 + ' / ' +
        req.params.valor2 + ' = ' + div)
})

app.post('/', (req, res) => {
    res.send('Got a POST request')
})
app.put('/user', (req, res) => {
    res.send('Got a PUT request at /user')
})
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})