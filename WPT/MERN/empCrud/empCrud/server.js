const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 5000;

// Middleware
app.use(bodyParser.json());
app.use(cors());

// MongoDB connection
mongoose.connect('mongodb://localhost:27017/employeeDB', { useNewUrlParser: true, useUnifiedTopology: true });

const employeeSchema = new mongoose.Schema({
    empname: String,
    salary: Number,
    department: String,
    age: Number,
    gender: String
});

const Employee = mongoose.model('Employee', employeeSchema);

// CRUD operations
app.get('/employees', async (req, res) => {
    const employees = await Employee.find();
    res.json(employees);
});

app.post('/employees', async (req, res) => {
    const employee = new Employee(req.body);
    await employee.save();
    res.json(employee);
});

app.put('/employees/:id', async (req, res) => {
    const employee = await Employee.findByIdAndUpdate(req.params.id, req.body, { new: true });
    res.json(employee);
});

app.delete('/employees/:id', async (req, res) => {
    await Employee.findByIdAndDelete(req.params.id);
    res.json({ message: 'Employee deleted' });
});

app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});
