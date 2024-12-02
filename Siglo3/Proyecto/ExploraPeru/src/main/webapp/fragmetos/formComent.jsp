<section class="page-section" id="contact">
		<div class="container">
			<div class="text-center">
				<h2 class="section-heading text-uppercase">Contactanos</h2>
				<h3 class="section-subheading text-muted">Mandanos un mensajes con todos tus datos y proximamente nos estaremos comunicando con usted</h3>
			</div>
			<!-- * * * * * * * * * * * * * * *-->
			<!-- * * SB Forms Contact Form * *-->
			<!-- * * * * * * * * * * * * * * *-->
			<!-- This form is pre-integrated with SB Forms.-->
			<!-- To make this form functional, sign up at-->
			<!-- https://startbootstrap.com/solution/contact-forms-->
			<!-- to get an API token!-->
			<form id="contactForm" data-sb-form-api-token="API_TOKEN">
				<div class="row align-items-stretch mb-5">
					<div class="col-md-6">
						<div class="form-group">
							<!-- Name input-->
							<input class="form-control" id="name" type="text"
								placeholder="Ingrese su nombre *" data-sb-validations="required" />
							<div class="invalid-feedback" data-sb-feedback="name:required">A
							 El nombre es obligatorio</div>
						</div>
						<div class="form-group">
							<!-- Email address input-->
							<input class="form-control" id="email" type="email"
								placeholder="Ingrese su email *" data-sb-validations="required,email" pattern=".*@(hotmail\.com|gmail\.com)"/>
							<div class="invalid-feedback" data-sb-feedback="email:required">
								El correo es obligatorio</div>
							<div class="invalid-feedback" data-sb-feedback="email:email">Email no valido</div>
						</div>
						<div class="form-group mb-md-0">
							<!-- Phone number input-->
							<input class="form-control" id="phone" type="tel"
								placeholder="Ingrese su numero celular *" data-sb-validations="required" />
							<div class="invalid-feedback" data-sb-feedback="phone:required">
								El numero de celular es obligatorio</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group form-group-textarea mb-md-0">
							<!-- Message input-->
							<textarea class="form-control" id="message"
								placeholder="Your Message *" data-sb-validations="required"></textarea>
							<div class="invalid-feedback" data-sb-feedback="message:required">A
								message is required.</div>
						</div>
					</div>
				</div>
				<!-- Submit success message-->
				<!---->
				<!-- This is what your users will see when the form-->
				<!-- has successfully submitted-->
				<div class="d-none" id="submitSuccessMessage">
					<div class="text-center text-white mb-3">
						<div class="fw-bolder">Correo enviado correctamente!</div>
						
					</div>
				</div>
				<!-- Submit error message-->
				<!---->
				<!-- This is what your users will see when there is-->
				<!-- an error submitting the form-->
				<div class="d-none" id="submitErrorMessage">
					<div class="text-center text-danger mb-3">Error sending
						message!</div>
				</div>
				<!-- Submit Button-->
				<div class="text-center">
					<button class="btn btn-primary btn-xl text-uppercase disabled"
						id="submitButton" type="submit">Send Message</button>
				</div>
			</form>
		</div>
	</section>