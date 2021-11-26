package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTeacherCharge;
import cn.ibizlab.ehr.webapi.dto.TrmTeacherChargeDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTeacherChargeMappingImpl implements TrmTeacherChargeMapping {

    @Override
    public TrmTeacherCharge toDomain(TrmTeacherChargeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTeacherCharge trmTeacherCharge = new TrmTeacherCharge();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTeacherCharge.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTeacherCharge.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJsdj() != null ) {
            trmTeacherCharge.setJsdj( dto.getJsdj() );
        }
        if ( dto.getDj() != null ) {
            trmTeacherCharge.setDj( dto.getDj() );
        }
        if ( dto.getTrmteacherchargename() != null ) {
            trmTeacherCharge.setTrmteacherchargename( dto.getTrmteacherchargename() );
        }
        if ( dto.getZfy() != null ) {
            trmTeacherCharge.setZfy( dto.getZfy() );
        }
        if ( dto.getXs() != null ) {
            trmTeacherCharge.setXs( dto.getXs() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            trmTeacherCharge.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getTrmtrainteacherid() != null ) {
            trmTeacherCharge.setTrmtrainteacherid( dto.getTrmtrainteacherid() );
        }
        if ( dto.getTrmteacherchargeid() != null ) {
            trmTeacherCharge.setTrmteacherchargeid( dto.getTrmteacherchargeid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTeacherCharge.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTeacherCharge.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTeacherCharge.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmTeacherCharge.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTeacherCharge.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainteachername() != null ) {
            trmTeacherCharge.setTrmtrainteachername( dto.getTrmtrainteachername() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            trmTeacherCharge.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }

        return trmTeacherCharge;
    }

    @Override
    public TrmTeacherChargeDTO toDto(TrmTeacherCharge entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTeacherChargeDTO trmTeacherChargeDTO = new TrmTeacherChargeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTeacherChargeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTeacherChargeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJsdj() != null ) {
            trmTeacherChargeDTO.setJsdj( entity.getJsdj() );
        }
        if ( entity.getDj() != null ) {
            trmTeacherChargeDTO.setDj( entity.getDj() );
        }
        if ( entity.getTrmteacherchargename() != null ) {
            trmTeacherChargeDTO.setTrmteacherchargename( entity.getTrmteacherchargename() );
        }
        if ( entity.getZfy() != null ) {
            trmTeacherChargeDTO.setZfy( entity.getZfy() );
        }
        if ( entity.getXs() != null ) {
            trmTeacherChargeDTO.setXs( entity.getXs() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            trmTeacherChargeDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getTrmtrainteacherid() != null ) {
            trmTeacherChargeDTO.setTrmtrainteacherid( entity.getTrmtrainteacherid() );
        }
        if ( entity.getTrmteacherchargeid() != null ) {
            trmTeacherChargeDTO.setTrmteacherchargeid( entity.getTrmteacherchargeid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTeacherChargeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTeacherChargeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTeacherChargeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmTeacherChargeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTeacherChargeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainteachername() != null ) {
            trmTeacherChargeDTO.setTrmtrainteachername( entity.getTrmtrainteachername() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            trmTeacherChargeDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }

        return trmTeacherChargeDTO;
    }

    @Override
    public List<TrmTeacherCharge> toDomain(List<TrmTeacherChargeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTeacherCharge> list = new ArrayList<TrmTeacherCharge>( dtoList.size() );
        for ( TrmTeacherChargeDTO trmTeacherChargeDTO : dtoList ) {
            list.add( toDomain( trmTeacherChargeDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTeacherChargeDTO> toDto(List<TrmTeacherCharge> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTeacherChargeDTO> list = new ArrayList<TrmTeacherChargeDTO>( entityList.size() );
        for ( TrmTeacherCharge trmTeacherCharge : entityList ) {
            list.add( toDto( trmTeacherCharge ) );
        }

        return list;
    }
}
