package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimLabourcampany;
import cn.ibizlab.ehr.webapi.dto.PimLabourcampanyDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimLabourcampanyMappingImpl implements PimLabourcampanyMapping {

    @Override
    public PimLabourcampany toDomain(PimLabourcampanyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimLabourcampany pimLabourcampany = new PimLabourcampany();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimLabourcampany.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimLabourcampany.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLxfs() != null ) {
            pimLabourcampany.setLxfs( dto.getLxfs() );
        }
        if ( dto.getLegalperosn() != null ) {
            pimLabourcampany.setLegalperosn( dto.getLegalperosn() );
        }
        if ( dto.getRegcapital() != null ) {
            pimLabourcampany.setRegcapital( dto.getRegcapital() );
        }
        if ( dto.getPimlabourcampanyname() != null ) {
            pimLabourcampany.setPimlabourcampanyname( dto.getPimlabourcampanyname() );
        }
        if ( dto.getJyfw() != null ) {
            pimLabourcampany.setJyfw( dto.getJyfw() );
        }
        if ( dto.getLxr() != null ) {
            pimLabourcampany.setLxr( dto.getLxr() );
        }
        if ( dto.getGsjj() != null ) {
            pimLabourcampany.setGsjj( dto.getGsjj() );
        }
        if ( dto.getLxdz() != null ) {
            pimLabourcampany.setLxdz( dto.getLxdz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimLabourcampany.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimLabourcampany.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimLabourcampany.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimLabourcampany.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimLabourcampany.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            pimLabourcampany.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimLabourcampany.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimlabourcampanyid() != null ) {
            pimLabourcampany.setPimlabourcampanyid( dto.getPimlabourcampanyid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimLabourcampany.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimLabourcampany.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimLabourcampany.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getZzdzs() != null ) {
            pimLabourcampany.setZzdzs( dto.getZzdzs() );
        }

        return pimLabourcampany;
    }

    @Override
    public PimLabourcampanyDTO toDto(PimLabourcampany entity) {
        if ( entity == null ) {
            return null;
        }

        PimLabourcampanyDTO pimLabourcampanyDTO = new PimLabourcampanyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimLabourcampanyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimLabourcampanyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLxfs() != null ) {
            pimLabourcampanyDTO.setLxfs( entity.getLxfs() );
        }
        if ( entity.getLegalperosn() != null ) {
            pimLabourcampanyDTO.setLegalperosn( entity.getLegalperosn() );
        }
        if ( entity.getRegcapital() != null ) {
            pimLabourcampanyDTO.setRegcapital( entity.getRegcapital() );
        }
        if ( entity.getPimlabourcampanyname() != null ) {
            pimLabourcampanyDTO.setPimlabourcampanyname( entity.getPimlabourcampanyname() );
        }
        if ( entity.getJyfw() != null ) {
            pimLabourcampanyDTO.setJyfw( entity.getJyfw() );
        }
        if ( entity.getLxr() != null ) {
            pimLabourcampanyDTO.setLxr( entity.getLxr() );
        }
        if ( entity.getGsjj() != null ) {
            pimLabourcampanyDTO.setGsjj( entity.getGsjj() );
        }
        if ( entity.getLxdz() != null ) {
            pimLabourcampanyDTO.setLxdz( entity.getLxdz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimLabourcampanyDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimLabourcampanyDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimLabourcampanyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimLabourcampanyDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimLabourcampanyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            pimLabourcampanyDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimLabourcampanyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimlabourcampanyid() != null ) {
            pimLabourcampanyDTO.setPimlabourcampanyid( entity.getPimlabourcampanyid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimLabourcampanyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimLabourcampanyDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimLabourcampanyDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getZzdzs() != null ) {
            pimLabourcampanyDTO.setZzdzs( entity.getZzdzs() );
        }

        return pimLabourcampanyDTO;
    }

    @Override
    public List<PimLabourcampany> toDomain(List<PimLabourcampanyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimLabourcampany> list = new ArrayList<PimLabourcampany>( dtoList.size() );
        for ( PimLabourcampanyDTO pimLabourcampanyDTO : dtoList ) {
            list.add( toDomain( pimLabourcampanyDTO ) );
        }

        return list;
    }

    @Override
    public List<PimLabourcampanyDTO> toDto(List<PimLabourcampany> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimLabourcampanyDTO> list = new ArrayList<PimLabourcampanyDTO>( entityList.size() );
        for ( PimLabourcampany pimLabourcampany : entityList ) {
            list.add( toDto( pimLabourcampany ) );
        }

        return list;
    }
}
