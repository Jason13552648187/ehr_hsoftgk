package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.common.domain.CodeList1;
import cn.ibizlab.ehr.webapi.dto.CodeList1DTO;
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
public class CodeList1MappingImpl implements CodeList1Mapping {

    @Override
    public CodeList1 toDomain(CodeList1DTO dto) {
        if ( dto == null ) {
            return null;
        }

        CodeList1 codeList1 = new CodeList1();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            codeList1.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            codeList1.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getValueseperator() != null ) {
            codeList1.setValueseperator( dto.getValueseperator() );
        }
        if ( dto.getClpath() != null ) {
            codeList1.setClpath( dto.getClpath() );
        }
        if ( dto.getIsuserscope() != null ) {
            codeList1.setIsuserscope( dto.getIsuserscope() );
        }
        if ( dto.getIssystem() != null ) {
            codeList1.setIssystem( dto.getIssystem() );
        }
        if ( dto.getSeperator() != null ) {
            codeList1.setSeperator( dto.getSeperator() );
        }
        if ( dto.getSrfsyspub() != null ) {
            codeList1.setSrfsyspub( dto.getSrfsyspub() );
        }
        if ( dto.getReserver5() != null ) {
            codeList1.setReserver5( dto.getReserver5() );
        }
        if ( dto.getReserver() != null ) {
            codeList1.setReserver( dto.getReserver() );
        }
        if ( dto.getReserver4() != null ) {
            codeList1.setReserver4( dto.getReserver4() );
        }
        if ( dto.getReserver3() != null ) {
            codeList1.setReserver3( dto.getReserver3() );
        }
        if ( dto.getOrmode() != null ) {
            codeList1.setOrmode( dto.getOrmode() );
        }
        if ( dto.getEmptytext() != null ) {
            codeList1.setEmptytext( dto.getEmptytext() );
        }
        if ( dto.getFiller() != null ) {
            codeList1.setFiller( dto.getFiller() );
        }
        if ( dto.getClversion() != null ) {
            codeList1.setClversion( dto.getClversion() );
        }
        if ( dto.getNovalueempty() != null ) {
            codeList1.setNovalueempty( dto.getNovalueempty() );
        }
        if ( dto.getCodelistname() != null ) {
            codeList1.setCodelistname( dto.getCodelistname() );
        }
        if ( dto.getClmodel() != null ) {
            codeList1.setClmodel( dto.getClmodel() );
        }
        if ( dto.getMemo() != null ) {
            codeList1.setMemo( dto.getMemo() );
        }
        if ( dto.getReserver2() != null ) {
            codeList1.setReserver2( dto.getReserver2() );
        }
        if ( dto.getClparam() != null ) {
            codeList1.setClparam( dto.getClparam() );
        }
        if ( dto.getSrfuserpub() != null ) {
            codeList1.setSrfuserpub( dto.getSrfuserpub() );
        }
        if ( dto.getUpdateman() != null ) {
            codeList1.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            codeList1.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            codeList1.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            codeList1.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCodelistid() != null ) {
            codeList1.setCodelistid( dto.getCodelistid() );
        }

        return codeList1;
    }

    @Override
    public CodeList1DTO toDto(CodeList1 entity) {
        if ( entity == null ) {
            return null;
        }

        CodeList1DTO codeList1DTO = new CodeList1DTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            codeList1DTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            codeList1DTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getValueseperator() != null ) {
            codeList1DTO.setValueseperator( entity.getValueseperator() );
        }
        if ( entity.getClpath() != null ) {
            codeList1DTO.setClpath( entity.getClpath() );
        }
        if ( entity.getIsuserscope() != null ) {
            codeList1DTO.setIsuserscope( entity.getIsuserscope() );
        }
        if ( entity.getIssystem() != null ) {
            codeList1DTO.setIssystem( entity.getIssystem() );
        }
        if ( entity.getSeperator() != null ) {
            codeList1DTO.setSeperator( entity.getSeperator() );
        }
        if ( entity.getSrfsyspub() != null ) {
            codeList1DTO.setSrfsyspub( entity.getSrfsyspub() );
        }
        if ( entity.getReserver5() != null ) {
            codeList1DTO.setReserver5( entity.getReserver5() );
        }
        if ( entity.getReserver() != null ) {
            codeList1DTO.setReserver( entity.getReserver() );
        }
        if ( entity.getReserver4() != null ) {
            codeList1DTO.setReserver4( entity.getReserver4() );
        }
        if ( entity.getReserver3() != null ) {
            codeList1DTO.setReserver3( entity.getReserver3() );
        }
        if ( entity.getOrmode() != null ) {
            codeList1DTO.setOrmode( entity.getOrmode() );
        }
        if ( entity.getEmptytext() != null ) {
            codeList1DTO.setEmptytext( entity.getEmptytext() );
        }
        if ( entity.getFiller() != null ) {
            codeList1DTO.setFiller( entity.getFiller() );
        }
        if ( entity.getClversion() != null ) {
            codeList1DTO.setClversion( entity.getClversion() );
        }
        if ( entity.getNovalueempty() != null ) {
            codeList1DTO.setNovalueempty( entity.getNovalueempty() );
        }
        if ( entity.getCodelistname() != null ) {
            codeList1DTO.setCodelistname( entity.getCodelistname() );
        }
        if ( entity.getClmodel() != null ) {
            codeList1DTO.setClmodel( entity.getClmodel() );
        }
        if ( entity.getMemo() != null ) {
            codeList1DTO.setMemo( entity.getMemo() );
        }
        if ( entity.getReserver2() != null ) {
            codeList1DTO.setReserver2( entity.getReserver2() );
        }
        if ( entity.getClparam() != null ) {
            codeList1DTO.setClparam( entity.getClparam() );
        }
        if ( entity.getSrfuserpub() != null ) {
            codeList1DTO.setSrfuserpub( entity.getSrfuserpub() );
        }
        if ( entity.getUpdateman() != null ) {
            codeList1DTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            codeList1DTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            codeList1DTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            codeList1DTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCodelistid() != null ) {
            codeList1DTO.setCodelistid( entity.getCodelistid() );
        }

        return codeList1DTO;
    }

    @Override
    public List<CodeList1> toDomain(List<CodeList1DTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CodeList1> list = new ArrayList<CodeList1>( dtoList.size() );
        for ( CodeList1DTO codeList1DTO : dtoList ) {
            list.add( toDomain( codeList1DTO ) );
        }

        return list;
    }

    @Override
    public List<CodeList1DTO> toDto(List<CodeList1> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CodeList1DTO> list = new ArrayList<CodeList1DTO>( entityList.size() );
        for ( CodeList1 codeList1 : entityList ) {
            list.add( toDto( codeList1 ) );
        }

        return list;
    }
}
