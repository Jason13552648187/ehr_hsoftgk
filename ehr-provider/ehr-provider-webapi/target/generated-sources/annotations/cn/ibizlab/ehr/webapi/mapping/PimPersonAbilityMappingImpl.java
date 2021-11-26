package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimPersonAbility;
import cn.ibizlab.ehr.webapi.dto.PimPersonAbilityDTO;
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
public class PimPersonAbilityMappingImpl implements PimPersonAbilityMapping {

    @Override
    public PimPersonAbility toDomain(PimPersonAbilityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimPersonAbility pimPersonAbility = new PimPersonAbility();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimPersonAbility.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimPersonAbility.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPerformscore() != null ) {
            pimPersonAbility.setPerformscore( dto.getPerformscore() );
        }
        if ( dto.getTechscore() != null ) {
            pimPersonAbility.setTechscore( dto.getTechscore() );
        }
        if ( dto.getYear() != null ) {
            pimPersonAbility.setYear( dto.getYear() );
        }
        if ( dto.getPracscore() != null ) {
            pimPersonAbility.setPracscore( dto.getPracscore() );
        }
        if ( dto.getRecorddate() != null ) {
            pimPersonAbility.setRecorddate( dto.getRecorddate() );
        }
        if ( dto.getMonth() != null ) {
            pimPersonAbility.setMonth( dto.getMonth() );
        }
        if ( dto.getTrainresultscore() != null ) {
            pimPersonAbility.setTrainresultscore( dto.getTrainresultscore() );
        }
        if ( dto.getEduscore() != null ) {
            pimPersonAbility.setEduscore( dto.getEduscore() );
        }
        if ( dto.getPimpersonabilityname() != null ) {
            pimPersonAbility.setPimpersonabilityname( dto.getPimpersonabilityname() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimPersonAbility.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimpersonabilityid() != null ) {
            pimPersonAbility.setPimpersonabilityid( dto.getPimpersonabilityid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimPersonAbility.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimPersonAbility.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimPersonAbility.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimPersonAbility.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimPersonAbility.setPimpersonname( dto.getPimpersonname() );
        }

        return pimPersonAbility;
    }

    @Override
    public PimPersonAbilityDTO toDto(PimPersonAbility entity) {
        if ( entity == null ) {
            return null;
        }

        PimPersonAbilityDTO pimPersonAbilityDTO = new PimPersonAbilityDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimPersonAbilityDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimPersonAbilityDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPerformscore() != null ) {
            pimPersonAbilityDTO.setPerformscore( entity.getPerformscore() );
        }
        if ( entity.getTechscore() != null ) {
            pimPersonAbilityDTO.setTechscore( entity.getTechscore() );
        }
        if ( entity.getYear() != null ) {
            pimPersonAbilityDTO.setYear( entity.getYear() );
        }
        if ( entity.getPracscore() != null ) {
            pimPersonAbilityDTO.setPracscore( entity.getPracscore() );
        }
        if ( entity.getRecorddate() != null ) {
            pimPersonAbilityDTO.setRecorddate( entity.getRecorddate() );
        }
        if ( entity.getMonth() != null ) {
            pimPersonAbilityDTO.setMonth( entity.getMonth() );
        }
        if ( entity.getTrainresultscore() != null ) {
            pimPersonAbilityDTO.setTrainresultscore( entity.getTrainresultscore() );
        }
        if ( entity.getEduscore() != null ) {
            pimPersonAbilityDTO.setEduscore( entity.getEduscore() );
        }
        if ( entity.getPimpersonabilityname() != null ) {
            pimPersonAbilityDTO.setPimpersonabilityname( entity.getPimpersonabilityname() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimPersonAbilityDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimpersonabilityid() != null ) {
            pimPersonAbilityDTO.setPimpersonabilityid( entity.getPimpersonabilityid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimPersonAbilityDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimPersonAbilityDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimPersonAbilityDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimPersonAbilityDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimPersonAbilityDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimPersonAbilityDTO;
    }

    @Override
    public List<PimPersonAbility> toDomain(List<PimPersonAbilityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimPersonAbility> list = new ArrayList<PimPersonAbility>( dtoList.size() );
        for ( PimPersonAbilityDTO pimPersonAbilityDTO : dtoList ) {
            list.add( toDomain( pimPersonAbilityDTO ) );
        }

        return list;
    }

    @Override
    public List<PimPersonAbilityDTO> toDto(List<PimPersonAbility> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimPersonAbilityDTO> list = new ArrayList<PimPersonAbilityDTO>( entityList.size() );
        for ( PimPersonAbility pimPersonAbility : entityList ) {
            list.add( toDto( pimPersonAbility ) );
        }

        return list;
    }
}
