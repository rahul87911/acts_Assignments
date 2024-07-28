const express = require('express');
const mysql = require('mysql2');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 5000;

// Middleware
app.use(bodyParser.json());
app.use(cors());

// MySQL connection
const db = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'Neelam@12345',
    database: 'employeeDB'
});

db.connect((err) => {
    if (err) throw err;
    console.log('MySQL Connected...');
});

// CRUD operations
app.get('/employees', (req, res) => {
    const sql = 'SELECT * FROM employees';
    db.query(sql, (err, results) => {
        if (err) throw err;
        res.json(results);
    });
});

app.post('/employees', (req, res) => {
    const sql = 'INSERT INTO employees SET ?';
    const newEmployee = req.body;
    db.query(sql, newEmployee, (err, result) => {
        if (err) throw err;
        res.json(result);
    });
});

app.put('/employees/:id', (req, res) => {
    const sql = 'UPDATE employees SET ? WHERE empid = ?';
    const updatedEmployee = req.body;
    db.query(sql, [updatedEmployee, req.params.id], (err, result) => {
        if (err) throw err;
        res.json(result);
    });
});

app.delete('/employees/:id', (req, res) => {
    const sql = 'DELETE FROM employees WHERE empid = ?';
    db.query(sql, [req.params.id], (err, result) => {
        if (err) throw err;
        res.json({ message: 'Employee deleted' });
    });
});

app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});
