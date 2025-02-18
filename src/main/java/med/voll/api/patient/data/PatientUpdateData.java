package med.voll.api.patient.data;

import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressData;

public record PatientUpdateData(
        @NotNull Long id,
        String name,
        String phone,
        AddressData addressData
) {
}
