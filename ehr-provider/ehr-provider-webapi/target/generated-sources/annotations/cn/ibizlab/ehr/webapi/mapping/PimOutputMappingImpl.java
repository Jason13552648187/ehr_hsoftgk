package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimOutput;
import cn.ibizlab.ehr.webapi.dto.PimOutputDTO;
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
public class PimOutputMappingImpl implements PimOutputMapping {

    @Override
    public PimOutput toDomain(PimOutputDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimOutput pimOutput = new PimOutput();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimOutput.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimOutput.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYd() != null ) {
            pimOutput.setYd( dto.getYd() );
        }
        if ( dto.getPimoutputname() != null ) {
            pimOutput.setPimoutputname( dto.getPimoutputname() );
        }
        if ( dto.getNd() != null ) {
            pimOutput.setNd( dto.getNd() );
        }
        if ( dto.getOutput() != null ) {
            pimOutput.setOutput( dto.getOutput() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimOutput.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            pimOutput.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimoutputid() != null ) {
            pimOutput.setPimoutputid( dto.getPimoutputid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimOutput.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            pimOutput.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimOutput.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimOutput.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getZzxs() != null ) {
            pimOutput.setZzxs( dto.getZzxs() );
        }
        if ( dto.getOrgcode() != null ) {
            pimOutput.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimOutput.setOrmorgname( dto.getOrmorgname() );
        }

        return pimOutput;
    }

    @Override
    public PimOutputDTO toDto(PimOutput entity) {
        if ( entity == null ) {
            return null;
        }

        PimOutputDTO pimOutputDTO = new PimOutputDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimOutputDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimOutputDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYd() != null ) {
            pimOutputDTO.setYd( entity.getYd() );
        }
        if ( entity.getPimoutputname() != null ) {
            pimOutputDTO.setPimoutputname( entity.getPimoutputname() );
        }
        if ( entity.getNd() != null ) {
            pimOutputDTO.setNd( entity.getNd() );
        }
        if ( entity.getOutput() != null ) {
            pimOutputDTO.setOutput( entity.getOutput() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimOutputDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            pimOutputDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimoutputid() != null ) {
            pimOutputDTO.setPimoutputid( entity.getPimoutputid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimOutputDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            pimOutputDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimOutputDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimOutputDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getZzxs() != null ) {
            pimOutputDTO.setZzxs( entity.getZzxs() );
        }
        if ( entity.getOrgcode() != null ) {
            pimOutputDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimOutputDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pimOutputDTO;
    }

    @Override
    public List<PimOutput> toDomain(List<PimOutputDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimOutput> list = new ArrayList<PimOutput>( dtoList.size() );
        for ( PimOutputDTO pimOutputDTO : dtoList ) {
            list.add( toDomain( pimOutputDTO ) );
        }

        return list;
    }

    @Override
    public List<PimOutputDTO> toDto(List<PimOutput> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimOutputDTO> list = new ArrayList<PimOutputDTO>( entityList.size() );
        for ( PimOutput pimOutput : entityList ) {
            list.add( toDto( pimOutput ) );
        }

        return list;
    }
}
