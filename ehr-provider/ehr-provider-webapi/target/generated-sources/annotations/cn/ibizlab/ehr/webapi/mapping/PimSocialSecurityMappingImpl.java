package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimSocialSecurity;
import cn.ibizlab.ehr.webapi.dto.PimSocialSecurityDTO;
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
public class PimSocialSecurityMappingImpl implements PimSocialSecurityMapping {

    @Override
    public PimSocialSecurity toDomain(PimSocialSecurityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimSocialSecurity pimSocialSecurity = new PimSocialSecurity();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimSocialSecurity.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimSocialSecurity.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimsocialsecurityname() != null ) {
            pimSocialSecurity.setPimsocialsecurityname( dto.getPimsocialsecurityname() );
        }
        if ( dto.getJndw() != null ) {
            pimSocialSecurity.setJndw( dto.getJndw() );
        }
        if ( dto.getSbbl() != null ) {
            pimSocialSecurity.setSbbl( dto.getSbbl() );
        }
        if ( dto.getLx() != null ) {
            pimSocialSecurity.setLx( dto.getLx() );
        }
        if ( dto.getBxjs() != null ) {
            pimSocialSecurity.setBxjs( dto.getBxjs() );
        }
        if ( dto.getCbdq() != null ) {
            pimSocialSecurity.setCbdq( dto.getCbdq() );
        }
        if ( dto.getJnzt() != null ) {
            pimSocialSecurity.setJnzt( dto.getJnzt() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimSocialSecurity.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            pimSocialSecurity.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimSocialSecurity.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimsocialsecurityid() != null ) {
            pimSocialSecurity.setPimsocialsecurityid( dto.getPimsocialsecurityid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimSocialSecurity.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimSocialSecurity.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            pimSocialSecurity.setUpdateman( dto.getUpdateman() );
        }

        return pimSocialSecurity;
    }

    @Override
    public PimSocialSecurityDTO toDto(PimSocialSecurity entity) {
        if ( entity == null ) {
            return null;
        }

        PimSocialSecurityDTO pimSocialSecurityDTO = new PimSocialSecurityDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimSocialSecurityDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimSocialSecurityDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimsocialsecurityname() != null ) {
            pimSocialSecurityDTO.setPimsocialsecurityname( entity.getPimsocialsecurityname() );
        }
        if ( entity.getJndw() != null ) {
            pimSocialSecurityDTO.setJndw( entity.getJndw() );
        }
        if ( entity.getSbbl() != null ) {
            pimSocialSecurityDTO.setSbbl( entity.getSbbl() );
        }
        if ( entity.getLx() != null ) {
            pimSocialSecurityDTO.setLx( entity.getLx() );
        }
        if ( entity.getBxjs() != null ) {
            pimSocialSecurityDTO.setBxjs( entity.getBxjs() );
        }
        if ( entity.getCbdq() != null ) {
            pimSocialSecurityDTO.setCbdq( entity.getCbdq() );
        }
        if ( entity.getJnzt() != null ) {
            pimSocialSecurityDTO.setJnzt( entity.getJnzt() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimSocialSecurityDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            pimSocialSecurityDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimSocialSecurityDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimsocialsecurityid() != null ) {
            pimSocialSecurityDTO.setPimsocialsecurityid( entity.getPimsocialsecurityid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimSocialSecurityDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimSocialSecurityDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            pimSocialSecurityDTO.setUpdateman( entity.getUpdateman() );
        }

        return pimSocialSecurityDTO;
    }

    @Override
    public List<PimSocialSecurity> toDomain(List<PimSocialSecurityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimSocialSecurity> list = new ArrayList<PimSocialSecurity>( dtoList.size() );
        for ( PimSocialSecurityDTO pimSocialSecurityDTO : dtoList ) {
            list.add( toDomain( pimSocialSecurityDTO ) );
        }

        return list;
    }

    @Override
    public List<PimSocialSecurityDTO> toDto(List<PimSocialSecurity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimSocialSecurityDTO> list = new ArrayList<PimSocialSecurityDTO>( entityList.size() );
        for ( PimSocialSecurity pimSocialSecurity : entityList ) {
            list.add( toDto( pimSocialSecurity ) );
        }

        return list;
    }
}
