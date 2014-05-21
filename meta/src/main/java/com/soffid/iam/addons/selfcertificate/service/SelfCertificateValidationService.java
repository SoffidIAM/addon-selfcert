//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.selfcertificate.service;
import com.soffid.iam.service.CertificateValidationService;
import com.soffid.mda.annotation.*;

import org.springframework.transaction.annotation.Transactional;

@Service ( internal=true,
	 translatedName="SelfCertificateValidationService",
	 translatedPackage="com.soffid.iam.addons.selfcertificate.service")
@Depends ({com.soffid.iam.addons.selfcertificate.service.SelfCertificateService.class,
	com.soffid.iam.addons.selfcertificate.model.RootCertificateEntity.class,
	com.soffid.iam.addons.selfcertificate.model.SelfCertificateEntity.class,
	es.caib.seycon.ng.servei.UsuariService.class})
public abstract class SelfCertificateValidationService extends CertificateValidationService {

}
