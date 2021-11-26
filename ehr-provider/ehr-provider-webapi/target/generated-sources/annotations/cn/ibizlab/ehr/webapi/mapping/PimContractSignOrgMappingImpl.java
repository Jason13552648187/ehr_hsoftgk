package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimContractSignOrg;
import cn.ibizlab.ehr.webapi.dto.PimContractSignOrgDTO;
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
public class PimContractSignOrgMappingImpl implements PimContractSignOrgMapping {

    @Override
    public PimContractSignOrg toDomain(PimContractSignOrgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimContractSignOrg pimContractSignOrg = new PimContractSignOrg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimContractSignOrg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimContractSignOrg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getContractsignorgname() != null ) {
            pimContractSignOrg.setContractsignorgname( dto.getContractsignorgname() );
        }
        if ( dto.getIsdefaultsignorg() != null ) {
            pimContractSignOrg.setIsdefaultsignorg( dto.getIsdefaultsignorg() );
        }
        if ( dto.getOrmsignorgid() != null ) {
            pimContractSignOrg.setOrmsignorgid( dto.getOrmsignorgid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimContractSignOrg.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimContractSignOrg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getContractsignorgid() != null ) {
            pimContractSignOrg.setContractsignorgid( dto.getContractsignorgid() );
        }
        if ( dto.getCreateman() != null ) {
            pimContractSignOrg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimContractSignOrg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimContractSignOrg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimContractSignOrg.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmsignorgname() != null ) {
            pimContractSignOrg.setOrmsignorgname( dto.getOrmsignorgname() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimContractSignOrg.setOrmorgname( dto.getOrmorgname() );
        }

        return pimContractSignOrg;
    }

    @Override
    public PimContractSignOrgDTO toDto(PimContractSignOrg entity) {
        if ( entity == null ) {
            return null;
        }

        PimContractSignOrgDTO pimContractSignOrgDTO = new PimContractSignOrgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimContractSignOrgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimContractSignOrgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getContractsignorgname() != null ) {
            pimContractSignOrgDTO.setContractsignorgname( entity.getContractsignorgname() );
        }
        if ( entity.getIsdefaultsignorg() != null ) {
            pimContractSignOrgDTO.setIsdefaultsignorg( entity.getIsdefaultsignorg() );
        }
        if ( entity.getOrmsignorgid() != null ) {
            pimContractSignOrgDTO.setOrmsignorgid( entity.getOrmsignorgid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimContractSignOrgDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimContractSignOrgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getContractsignorgid() != null ) {
            pimContractSignOrgDTO.setContractsignorgid( entity.getContractsignorgid() );
        }
        if ( entity.getCreateman() != null ) {
            pimContractSignOrgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimContractSignOrgDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimContractSignOrgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimContractSignOrgDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmsignorgname() != null ) {
            pimContractSignOrgDTO.setOrmsignorgname( entity.getOrmsignorgname() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimContractSignOrgDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pimContractSignOrgDTO;
    }

    @Override
    public List<PimContractSignOrg> toDomain(List<PimContractSignOrgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimContractSignOrg> list = new ArrayList<PimContractSignOrg>( dtoList.size() );
        for ( PimContractSignOrgDTO pimContractSignOrgDTO : dtoList ) {
            list.add( toDomain( pimContractSignOrgDTO ) );
        }

        return list;
    }

    @Override
    public List<PimContractSignOrgDTO> toDto(List<PimContractSignOrg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimContractSignOrgDTO> list = new ArrayList<PimContractSignOrgDTO>( entityList.size() );
        for ( PimContractSignOrg pimContractSignOrg : entityList ) {
            list.add( toDto( pimContractSignOrg ) );
        }

        return list;
    }
}
