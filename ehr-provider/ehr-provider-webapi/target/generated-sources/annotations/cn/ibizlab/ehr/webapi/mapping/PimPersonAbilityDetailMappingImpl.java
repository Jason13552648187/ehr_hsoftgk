package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimPersonAbilityDetail;
import cn.ibizlab.ehr.webapi.dto.PimPersonAbilityDetailDTO;
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
public class PimPersonAbilityDetailMappingImpl implements PimPersonAbilityDetailMapping {

    @Override
    public PimPersonAbilityDetail toDomain(PimPersonAbilityDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimPersonAbilityDetail pimPersonAbilityDetail = new PimPersonAbilityDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimPersonAbilityDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimPersonAbilityDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimpersonabilitydetailname() != null ) {
            pimPersonAbilityDetail.setPimpersonabilitydetailname( dto.getPimpersonabilitydetailname() );
        }
        if ( dto.getPimpersonabilityid() != null ) {
            pimPersonAbilityDetail.setPimpersonabilityid( dto.getPimpersonabilityid() );
        }
        if ( dto.getCreateman() != null ) {
            pimPersonAbilityDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimPersonAbilityDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimPersonAbilityDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpersonabilitydetailid() != null ) {
            pimPersonAbilityDetail.setPimpersonabilitydetailid( dto.getPimpersonabilitydetailid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimPersonAbilityDetail.setUpdatedate( dto.getUpdatedate() );
        }

        return pimPersonAbilityDetail;
    }

    @Override
    public PimPersonAbilityDetailDTO toDto(PimPersonAbilityDetail entity) {
        if ( entity == null ) {
            return null;
        }

        PimPersonAbilityDetailDTO pimPersonAbilityDetailDTO = new PimPersonAbilityDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimPersonAbilityDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimPersonAbilityDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimpersonabilitydetailname() != null ) {
            pimPersonAbilityDetailDTO.setPimpersonabilitydetailname( entity.getPimpersonabilitydetailname() );
        }
        if ( entity.getPimpersonabilityid() != null ) {
            pimPersonAbilityDetailDTO.setPimpersonabilityid( entity.getPimpersonabilityid() );
        }
        if ( entity.getCreateman() != null ) {
            pimPersonAbilityDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimPersonAbilityDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimPersonAbilityDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpersonabilitydetailid() != null ) {
            pimPersonAbilityDetailDTO.setPimpersonabilitydetailid( entity.getPimpersonabilitydetailid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimPersonAbilityDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pimPersonAbilityDetailDTO;
    }

    @Override
    public List<PimPersonAbilityDetail> toDomain(List<PimPersonAbilityDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimPersonAbilityDetail> list = new ArrayList<PimPersonAbilityDetail>( dtoList.size() );
        for ( PimPersonAbilityDetailDTO pimPersonAbilityDetailDTO : dtoList ) {
            list.add( toDomain( pimPersonAbilityDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<PimPersonAbilityDetailDTO> toDto(List<PimPersonAbilityDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimPersonAbilityDetailDTO> list = new ArrayList<PimPersonAbilityDetailDTO>( entityList.size() );
        for ( PimPersonAbilityDetail pimPersonAbilityDetail : entityList ) {
            list.add( toDto( pimPersonAbilityDetail ) );
        }

        return list;
    }
}
