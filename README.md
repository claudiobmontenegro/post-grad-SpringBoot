<h2 align="center">Prática da especialização em Desenvolvimento Web da Unipê - Turma 5 - 2022</h2>
<br><br>
<h3 align="center">Entidades e operações:</h1>
<br>
<h3 align="left">/aluno:</h3>
@PostMapping
<br>@GetMapping
<br>@GetMapping("/{id})
<br>@GetMapping("/like/{nome}")
<br>@DeleteMapping("/{id})
<br>@PutMapping("/alterar/{id})
<br>
<h3 align="left">/disciplina:</h3>
<br>@GetMapping
<br>@GetMapping("/{id})
<br>@GetMapping("/like/{nome}")
<br>@GetMapping("/orderByCargaHoraria")
<br>@DeleteMapping("/{id})
<br>@PutMapping("/alterar/{id})
<br>
<h3 align="left">/faculdade:</h3>
<br>@GetMapping
<br>@GetMapping("/{id})
<br>@GetMapping("/like/{nome}")
<br>@GetMapping("/orderByLocalidade")
<br>@DeleteMapping("/{id})
<br>@PutMapping("/alterar/{id})
<br>
<h3 align="left">/professor:</h3>
<br>@GetMapping
<br>@GetMapping("/{id})
<br>@GetMapping("/like/{nome}")
<br>@GetMapping("/orderByFaculdade")
<br>@GetMapping("/orderByDisciplina")
<br>@DeleteMapping("/{id})
<br>@PutMapping("/alterar/{id})
<br>
